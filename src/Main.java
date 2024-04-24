import com.fasterxml.jackson.databind.ObjectMapper;
import config.EntityCharacteristicsConfig;
import config.FieldSizeConfig;
import config.PossibilityOfEatenConfig;
import island.Field;
import models.Island;
import models.abstracts.Animal;
import models.abstracts.Entity;
import models.enums.EntityType;
import models.plants.Grass;
import models.predators.Wolf;
import service.MoveService;
import service.impl.MoveServiceImpl;
import service.impl.СhooseDirectionServiceImpl;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        ObjectMapper objectMapper = new ObjectMapper();
        EntityCharacteristicsConfig entityCharacteristicsConfig = new EntityCharacteristicsConfig(objectMapper, "characteristics_entity.json");
        PossibilityOfEatenConfig possibilityOfEatenConfig = new PossibilityOfEatenConfig(objectMapper, "possibility_of_eating.json");
        FieldSizeConfig fieldSizeConfig = new FieldSizeConfig(100, 20);
        Island island = createIsland(fieldSizeConfig);
        СhooseDirectionServiceImpl сhooseDirectionServiceImpl = new СhooseDirectionServiceImpl(random);
        MoveService moveService = new MoveServiceImpl(island);


            int maxPlantsOnField = getMaxCountOfField(entityCharacteristicsConfig, EntityType.GRASS);
            int maxWolfOnField = getMaxCountOfField(entityCharacteristicsConfig, EntityType.WOLF);
        //создаем траву
        island.getIsland().values() //возвращает коллекцию(Collection) значений;
                .forEach(value -> IntStream.range(0, random.nextInt(maxPlantsOnField)) //цикл, который сохраняет в value рандомный поток элементов с 0 до maxPlantsOnField
                .mapToObj(i -> createGrass(entityCharacteristicsConfig)) //создаем траву и сохранем ее в i
                .forEach(value::add)); //вызываем цикл и в остров?? давляем значения
        System.out.println(island);
        //создаем волка
        island.getIsland().values()
                .forEach(value -> IntStream.range(0, random.nextInt(maxWolfOnField))
                        .mapToObj(i -> createWolf(entityCharacteristicsConfig))
                        .forEach(value::add));
        //двигаем волка

        for (Map.Entry<Field, List<Entity>> fieldListEntry : island.getIsland().entrySet()) {
            Field field = fieldListEntry.getKey();
            List<Animal> entities = fieldListEntry.getValue()
                    .stream()
                    .filter(el -> el instanceof Animal)
                    .map(el -> (Animal) el)
                    .toList();
            for (Animal animal : entities) {
                int speed = getSpped(entityCharacteristicsConfig, EntityType.WOLF);//придумать как вместо волка подставлять всех животных с острова
                var directionToMove = сhooseDirectionServiceImpl.chooseDirectionService();
                moveService.move(animal, field,directionToMove,speed);
                
            }
        }
    }

    private static Grass createGrass(EntityCharacteristicsConfig entityCharacteristicsConfig) {
        return new Grass(entityCharacteristicsConfig.getEntityMapConfig().get(EntityType.GRASS));
    }

    private static Wolf createWolf(EntityCharacteristicsConfig entityCharacteristicsConfig){
        return new Wolf(entityCharacteristicsConfig.getEntityMapConfig().get(EntityType.WOLF));
    }

    private static Integer getMaxCountOfField(EntityCharacteristicsConfig entityCharacteristicsConfig, EntityType entityType) {
        return entityCharacteristicsConfig
                .getEntityMapConfig()
                .get(entityType)
                .getMaxCountOfField();
    }
    private static Integer getSpped(EntityCharacteristicsConfig entityCharacteristicsConfig, EntityType entityType) {
        return entityCharacteristicsConfig
                .getEntityMapConfig()
                .get(entityType)
                .getSpeed();
    }

    private static Island createIsland(FieldSizeConfig fieldSizeConfig) {
        Map<Field, List<Entity>> island = new HashMap<>();
        for (int i = 0; i < fieldSizeConfig.getHeight(); i++) {
            for (int j = 0; j < fieldSizeConfig.getWidth(); j++) {
                Field temp = new Field(i, j);
                island.put(temp, new ArrayList<>());
            }
        }
        return new Island(island);
    }
}
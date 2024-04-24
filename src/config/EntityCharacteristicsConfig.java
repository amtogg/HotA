package config;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.abstracts.Entity;
import models.enums.EntityType;

import java.util.HashMap;
import java.util.Map;

public class EntityCharacteristicsConfig {
    private Map<EntityType, Entity> entityMapConfig;

    public Map<EntityType, Entity> getEntityMapConfig() {
        return entityMapConfig;
    }

    public EntityCharacteristicsConfig(ObjectMapper objectMapper, String pathToJson) {
        // TODO код, который парсит json файл entityMapConfig
        HashMap <EntityType, Entity> entityMapConfig = new HashMap<>();
       // entityMapConfig.put(EntityType.GRASS, pathToJson);
        this.entityMapConfig =entityMapConfig;
    }
}

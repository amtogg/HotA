package config;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.abstracts.Entity;

import java.util.Map;

public class PossibilityOfEatenConfig {
    private Map<Map<Entity, Entity>, Long> possibilityOfEaten;

    public PossibilityOfEatenConfig(ObjectMapper objectMapper, String pathToJson) {
        // написать код который парсит json файл possibilityOfEaten

        this.possibilityOfEaten = possibilityOfEaten;
    }
    //((wolf, mous) = 80)

}

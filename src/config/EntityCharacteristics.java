package config;

import com.fasterxml.jackson.databind.ObjectMapper;
import models_of_heroes.abstracts.Entity;
import models_of_heroes.enums.EntityType;

import java.util.Map;

public class EntityCharacteristics {
    private Map<EntityType, Entity> entityMapConfig;

}

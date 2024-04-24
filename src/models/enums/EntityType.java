package models.enums;

import models.plants.Grass;
import models.predators.Fox;
import models.predators.Wolf;

public enum EntityType {
    GRASS ("grass", Grass.class),
    WOLF ("wolf", Wolf.class),
    FOX ("Fox", Fox.class);

    EntityType(String entityType, Class clazz) {
        this.entityType = entityType;
        this.clazz = clazz;
    }

    private String entityType;
    private Class clazz;
}

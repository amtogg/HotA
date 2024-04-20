package models_of_heroes.enums;

public enum EntityType {
    WOLF ("wolf", EntityType.class),
    FOX ("Fox", EntityType.class);

    EntityType(String entityType, Class clazz) {
        this.entityType = entityType;
        this.clazz = clazz;
    }

    private String entityType;
    private Class clazz;
}

package models;

import island.Field;
import models.abstracts.Entity;

import java.util.List;
import java.util.Map;

public class Island {
    Map<Field, List<Entity>> island;

    public Map<Field, List<Entity>> getIsland() {
        return island;
    }

    public Island(Map<Field, List<Entity>> island) {
        this.island = island;
    }
}

package models.plants;

import models.abstracts.Entity;

public abstract class Plants extends Entity {
    // поменять всю реализацию
    protected Plants(Double weight, Integer maxCountOfField, Integer speed, Double kgFullEating) {
        super(weight, maxCountOfField, speed, kgFullEating);
    }
}

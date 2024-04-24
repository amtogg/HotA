package models.predators;

import models.abstracts.Animal;
import models.abstracts.Entity;

public class Wolf extends Animal {
    public Wolf(Double weight, Integer maxCountOfField, Integer speed, Double kgFullEating) {
        super(weight, maxCountOfField, speed, kgFullEating);
    }

    public Wolf(Entity entity) {
       super(entity.getWeight(), entity.getMaxCountOfField(), entity.getSpeed(), entity.getKgFullEating());
    }
}

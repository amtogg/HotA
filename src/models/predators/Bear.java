package models.predators;

import models.abstracts.Animal;

public class Bear extends Animal {
    protected Bear(Double weight, Integer maxCountOfField, Integer speed, Double kgFullEating) {
        super(weight, maxCountOfField, speed, kgFullEating);
    }
}

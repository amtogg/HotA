package models_of_heroes.predators;

import models_of_heroes.abstracts.Animal;

public class Bear extends Animal {
    protected Bear(Double weight, Integer maxCountOfField, Integer speed, Double kgFullEating) {
        super(weight, maxCountOfField, speed, kgFullEating);
    }
}

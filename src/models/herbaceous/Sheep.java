package models.herbaceous;

import models.abstracts.Animal;

public class Sheep extends Animal {
    protected Sheep(Double weight, Integer maxCountOfField, Integer speed, Double kgFullEating) {
        super(weight, maxCountOfField, speed, kgFullEating);
    }
}

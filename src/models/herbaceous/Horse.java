package models.herbaceous;

import models.abstracts.Animal;

public class Horse extends Animal {
    protected Horse(Double weight, Integer maxCountOfField, Integer speed, Double kgFullEating) {
        super(weight, maxCountOfField, speed, kgFullEating);
    }
}

package models.herbaceous;

import models.abstracts.Animal;

public class Duck extends Animal {
    protected Duck(Double weight, Integer maxCountOfField, Integer speed, Double kgFullEating) {
        super(weight, maxCountOfField, speed, kgFullEating);
    }
}

package models.abstracts;

import service.ActionAnimal;

public abstract class Animal extends Entity implements ActionAnimal {
private boolean isMovedInThusCircle = false;

    protected Animal(Double weight, Integer maxCountOfField, Integer speed, Double kgFullEating) {
        super(weight, maxCountOfField, speed, kgFullEating);
    }

    @Override
    public void eat() {

    }

    @Override
    public void multiply() {

    }

    @Override
    public void chooseDirection() {

    }
}

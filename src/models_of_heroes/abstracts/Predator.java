package models_of_heroes.abstracts;

public abstract class Predator extends Animal{

    protected Predator(Double weight,
                       Integer maxCountOfField,
                       Integer speed,
                       Double kgFullEating) {
        super(weight, maxCountOfField, speed, kgFullEating);
    }
}

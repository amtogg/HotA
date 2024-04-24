package models.plants;

import models.abstracts.Entity;

public class Grass extends Plants{
    public Grass(Double weight,
                 Integer maxCountOfField,
                 Integer speed,
                 Double kgFullEating) {
        super(weight, maxCountOfField, speed, kgFullEating);
    }
    public Grass (Entity entity){
        super(entity.getWeight(), entity.getMaxCountOfField(), entity.getSpeed(), entity.getKgFullEating());
    }
}

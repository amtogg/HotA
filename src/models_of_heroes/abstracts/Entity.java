package models_of_heroes.abstracts;

public abstract class Entity {
    // public
    protected Entity(Double weight, Integer maxCountOfField, Integer speed, Double kgFullEating) {
        this.weight = weight;
        this.maxCountOfField = maxCountOfField;
        this.speed = speed;
        this.kgFullEating = kgFullEating;
    }

    private Double weight;
    private Integer maxCountOfField;
    private Integer speed;
    private Double kgFullEating;

    public Double getWeight() {
        return weight;
    }

    public Integer getMaxCountOfField() {
        return maxCountOfField;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Double getKgFullEating() {
        return kgFullEating;
    }
}

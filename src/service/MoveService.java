package service;

import island.Field;
import models.Island;
import models.abstracts.Animal;
import models.abstracts.Entity;
import models.enums.DirectionType;

public interface MoveService {

    void move (Animal animalToMove, Field from, DirectionType direction, int speed);
}

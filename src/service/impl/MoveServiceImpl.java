package service.impl;

import island.Field;
import models.Island;
import models.abstracts.Animal;
import models.abstracts.Entity;
import models.enums.DirectionType;
import service.MoveService;

public class MoveServiceImpl implements MoveService {
private final Island island;

    public MoveServiceImpl(Island island) {
        this.island = island;
    }

    @Override
    public void move(Animal animal, Field from, DirectionType direction, int speed) {
//TODO перемещать entity на поле
    }
}

package service.impl;

import models.enums.DirectionType;

import java.util.Random;

public class СhooseDirectionServiceImpl {
    private final Random random;

    public СhooseDirectionServiceImpl(Random random) {
        this.random = random;
    }

    public DirectionType chooseDirectionService () {
            random.nextInt(4);
            return DirectionType.values()[random.nextInt(DirectionType.values().length)];
        }
    }


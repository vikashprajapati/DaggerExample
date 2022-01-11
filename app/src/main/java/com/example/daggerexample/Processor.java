package com.example.daggerexample;

import javax.inject.Inject;

public class Processor {
    private Chip chip;
    private String clockSpeed;
    private String architecture;

    @Inject
    public Processor(Chip chip, String clockSpeed, String architecture) {
        this.chip = chip;
        this.clockSpeed = clockSpeed;
        this.architecture = architecture;
    }
}

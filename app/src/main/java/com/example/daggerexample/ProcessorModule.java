package com.example.daggerexample;

import dagger.Module;
import dagger.Provides;

@Module
public class ProcessorModule {

    @Provides
    Chip providesChip(){
        Chip chip = new Chip(4);
        chip.testCores();

        return chip;
    }

    @Provides
    Processor providesProcessor(Chip chip){
        return new Processor(chip, "4.2 ghz", "armv7");
    }
}

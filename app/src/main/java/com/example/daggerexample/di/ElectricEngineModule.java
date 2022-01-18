package com.example.daggerexample.di;

import com.example.daggerexample.model.ElectricEngine;
import com.example.daggerexample.model.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class ElectricEngineModule {
    private int power;

    public ElectricEngineModule(int power) {
        this.power = power;
    }

    @Provides
    public ElectricEngine providesElectricEngine(){
        return new ElectricEngine(power);
    }
}

package com.example.daggerexample.di;

import com.example.daggerexample.model.ElectricEngine;
import com.example.daggerexample.model.Engine;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ElectricEngineModule {
    /**
     * Dagger only sees return type for providing dependencies, it can't differentiate if for example
     * we inject 2 int dependencies like shown below
     * */
    @Provides
    public int providePower(@Named("engine power") int power){
        return power;
    }

    @Provides
    public Engine providesElectricEngine(ElectricEngine electricEngine){
        return electricEngine;
    }
}

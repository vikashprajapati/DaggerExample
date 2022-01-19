package com.example.daggerexample.di;

import com.example.daggerexample.model.DieselEngine;
import com.example.daggerexample.model.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    @Provides
    public Engine providesDieselEngine(DieselEngine dieselEngine){
        return dieselEngine;
    }
}

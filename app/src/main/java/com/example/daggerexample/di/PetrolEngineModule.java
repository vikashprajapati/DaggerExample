package com.example.daggerexample.di;

import com.example.daggerexample.model.Engine;
import com.example.daggerexample.model.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    /**
     * Providing interfaces using bind annotation
     * */
    @Binds
    public abstract Engine bindEngine(PetrolEngine petrolEngine);
}

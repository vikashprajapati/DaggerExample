package com.example.daggerexample.di;

import com.example.daggerexample.model.Car;
import com.example.daggerexample.model.DieselEngine;
import com.example.daggerexample.model.Engine;
import com.example.daggerexample.model.PetrolEngine;
import com.example.daggerexample.model.Rims;
import com.example.daggerexample.model.Wheels;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class AssemblyModule {

    @Provides
    public Car provideCar(PetrolEngine petrolEngine, Wheels wheels, Rims rims){
        return new Car(
                petrolEngine,
                wheels,
                rims
        );
    }

    /**
     * providing interface using Provides annotation.
     * Use Bind annotation for more concise implementation, see PetrolEngineModule for implementation
     * */
    @Provides
    public Engine providesDieselEngine(DieselEngine dieselEngine){
        return dieselEngine;
    }
}

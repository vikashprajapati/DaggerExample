package com.example.daggerexample.di;

import com.example.daggerexample.model.Car;
import com.example.daggerexample.MainActivity;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {
        ElectricEngineModule.class,
        PetrolEngineModule.class,
        AssemblyModule.class,
})
public interface CarComponent {
    void inject(MainActivity mainActivity);


    /**
     * This builder is just a normal builder pattern that we use in java
     * */
    @Component.Builder
    interface Builder{

        /**
         * Binding the value with named variable as dagger injects dependencies by looking at the type
         * so @Named is necessary to avoid ambiguity for injecting values of same type.
         *
         * same way @Named annotation must be used wherever below dependency is injected.
         *
         * see ElectricEngine class constructor to see example
         * */
        @BindsInstance
        Builder withPower(@Named("engine power") int power);

        /**
         * see DieselEngine class constructor to see example
         * */
        @BindsInstance
        Builder withEngineCapacity(@Named("engine capacity") int capacity);

        /**
         * This method is needed just like we need a build method in builder pattern. We don't have
         * to provide definitions for this as those definitions are provided by Dagger.
         * */
        CarComponent build();
    }
}

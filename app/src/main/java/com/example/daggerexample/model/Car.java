package com.example.daggerexample.model;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = Car.class.getCanonicalName();
    private Engine engine;
    private Wheels wheels;
    private Rims rims;

    /**
     * Constructor Injection, Dagger processes this annotation for generating Directed acyclic graph and
     * later generate instance of the Car, with the help of provided dependecies which also gets generated
     * by Dagger.
    * */
    @Inject
    public Car(Engine engine, Wheels wheels, Rims rims) {
        Log.i(TAG, "Car: created");
        this.engine = engine;
        this.wheels = wheels;
        this.rims = rims;
    }

    public void drive(){
        engine.start();
        Log.i(TAG, "driving car at full speed");
    }
}

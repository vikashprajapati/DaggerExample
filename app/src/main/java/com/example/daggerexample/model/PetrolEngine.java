package com.example.daggerexample.model;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine{
    private static final String TAG = PetrolEngine.class.getCanonicalName();
    
    @Inject
    public PetrolEngine() {
        Log.i(TAG, "PetrolEngine: created");
    }

    @Override
    public void start() {
        Log.i(TAG, "start: petrol engine started");
    }
}

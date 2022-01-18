package com.example.daggerexample.model;

import android.util.Log;

public class ElectricEngine implements Engine{
    private static final String TAG = ElectricEngine.class.getCanonicalName();

    /**
     * As this constructor needs a value to be passed which can only be provided at runtime so we cant use
     * Inject annotation here.
     * */
    public ElectricEngine(int power) {
        Log.i(TAG, "ElectricEngine: created with power: " + power);
    }

    @Override
    public void start() {
        Log.i(TAG, "start: electric engine");
    }
}

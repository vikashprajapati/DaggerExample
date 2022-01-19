package com.example.daggerexample.model;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class ElectricEngine implements Engine{
    private static final String TAG = ElectricEngine.class.getCanonicalName();

    /**
     * As this constructor needs a value to be passed which can only be provided at runtime so we cant use
     * Inject annotation here.
     *
     * if we use Inject annotation here which would only be possible if we have provides method for
     * the passed dependency, it given case below passed dependency is int power
     * */
    @Inject
    public ElectricEngine(@Named("engine power") int power) {
        Log.i(TAG, "ElectricEngine: created with power: " + power);
    }

    @Override
    public void start() {
        Log.i(TAG, "start: electric engine");
    }
}

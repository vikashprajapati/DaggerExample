package com.example.daggerexample.model;

import android.util.Log;

import javax.inject.Inject;

public class Wheels {
    private static final String TAG = Wheels.class.getCanonicalName();

    @Inject
    public Wheels() {
        Log.i(TAG, "Wheels: created");
    }
}

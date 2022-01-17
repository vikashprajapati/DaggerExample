package com.example.daggerexample.model;

import android.util.Log;

import javax.inject.Inject;

public class Rims {
    private static final String TAG = Rims.class.getCanonicalName();
    
    @Inject
    public Rims() {
        Log.i(TAG, "Rims: created");
    }
}

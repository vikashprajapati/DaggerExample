package com.example.daggerexample;

import android.util.Log;

import javax.inject.Inject;

public class Chip {
    private static final String TAG = Chip.class.getCanonicalName();
    private int cores;

    /**
     * Dagger does object creation of this class using ProcessorModule
     * */
    public Chip(int cores) {
        this.cores = cores;
    }

    public void testCores(){
        Log.i(TAG, "testCores: " + cores);
    }
}

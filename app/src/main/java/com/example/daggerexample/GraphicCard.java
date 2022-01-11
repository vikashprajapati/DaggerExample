package com.example.daggerexample;

import android.util.Log;

import javax.inject.Inject;

public class GraphicCard {
    private static final String TAG = GraphicCard.class.getCanonicalName();
    @Inject
    public GraphicCard() {
    }

    public void enable(Cpu cpu){
        Log.i(TAG, "enable: ");
    }
}

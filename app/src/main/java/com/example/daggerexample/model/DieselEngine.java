package com.example.daggerexample.model;

import android.os.Environment;
import android.util.Log;
import android.widget.EditText;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = DieselEngine.class.getCanonicalName();

    @Inject
    public DieselEngine() {
        Log.i(TAG, "DieselEngine: created");
    }

    @Override
    public void start() {
        Log.i(TAG, "start: diesel engine started");
    }
}

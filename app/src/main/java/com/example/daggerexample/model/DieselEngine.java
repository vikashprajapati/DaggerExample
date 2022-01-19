package com.example.daggerexample.model;

import android.os.Environment;
import android.util.Log;
import android.widget.EditText;

import java.lang.reflect.GenericDeclaration;

import javax.inject.Inject;
import javax.inject.Named;

public class DieselEngine implements Engine {
    private static final String TAG = DieselEngine.class.getCanonicalName();
    private int engineCapacity;

    @Inject
    public DieselEngine(@Named("engine capacity") int engineCapacity) {
        this.engineCapacity = engineCapacity;
        Log.i(TAG, "DieselEngine: created with capacity: " + engineCapacity);
    }

    @Override
    public void start() {
        Log.i(TAG, "start: diesel engine started");
    }
}

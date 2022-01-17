package com.example.daggerexample.model;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = Remote.class.getCanonicalName();
    
    @Inject
    public Remote() {
        Log.i(TAG, "Remote: created");
    }

    /**
     * Method Injection, This comes helpful in scenarios where we need to pass reference of current object,
     * which cannot be provided directly in current class constructor as <b>this</b> is not fully constructed
     * in its own constructor
     * */
    @Inject
    public void enableRemote(Car car){
        Log.i(TAG, "enableRemote: ");
    }
}

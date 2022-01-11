package com.example.daggerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    /**
     * Field Injection
     * */
    @Inject Cpu cpu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Returns the implementation of CpuComponent interface, which is generated by Dagger.
         * */
        CpuComponent cpuComponent = DaggerCpuComponent.create();

        /**
         * Calling Inject method is important for cpu field injection, with the reference of class/activity
         *
         * Note: Here we could not initialize cpu instance using constructor injection as we directly does
         * not call constructor of MainActivity, as it is called by Android System.
         * */
        cpuComponent.inject(this);

        cpu.start();
    }
}
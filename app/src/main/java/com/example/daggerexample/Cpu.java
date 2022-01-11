package com.example.daggerexample;

import android.util.Log;

import javax.inject.Inject;

public class Cpu {
    private static final String TAG = Cpu.class.getCanonicalName();
    private Processor processor;
    private Ram ram;
    private HardDisk hardDisk;

    /**
     * Constructor Injection, Dagger processes this annotation for generating Directed acyclic graph and
     * later generate instance of the Cpu, with the help of provided dependecies which also gets generated
     * by Dagger.
    * */
    @Inject
    public Cpu(Processor processor, Ram ram, HardDisk hardDisk) {
        this.processor = processor;
        this.ram = ram;
        this.hardDisk = hardDisk;
    }

    /**
     * Method Injection, This comes helpful in scenarios where we need to pass reference of current object,
     * which cannot be provided directly in current class constructor as <b>this</b> is not fully constructed
     * in its own constructor
    * */
    @Inject
    public void enable(GraphicCard graphicCard){
        graphicCard.enable(this);
    }

    public void start(){
        Log.i(TAG, "start: ");
    }
}

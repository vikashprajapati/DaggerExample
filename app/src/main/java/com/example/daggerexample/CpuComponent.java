package com.example.daggerexample;

import dagger.Component;

@Component(modules = {
    ProcessorModule.class
})
public interface CpuComponent {
    Cpu getCpu();

    void inject(MainActivity mainActivity);
}

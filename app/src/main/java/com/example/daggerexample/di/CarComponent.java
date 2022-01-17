package com.example.daggerexample.di;

import com.example.daggerexample.model.Car;
import com.example.daggerexample.MainActivity;

import dagger.Component;

@Component(modules = {
    AssemblyModule.class
})
public interface CarComponent {
    void inject(MainActivity mainActivity);
}

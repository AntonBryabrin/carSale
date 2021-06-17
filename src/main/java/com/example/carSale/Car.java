package com.example.carSale;

public class Car {

    private Configurable configuration;

    public Car(Configurable configuration) {
        this.configuration = configuration;
    }

    public String readyForSale() {
        return "Car ready in " + configuration.makeConfiguration();
    }

}
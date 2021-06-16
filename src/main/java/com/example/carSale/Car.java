package com.example.carSale;

public class Car {
/*  //  private YellowCarConfiguration yellowCarConfiguration;
    private RedColourCarConfiguration redColourCarConfiguration;

    public String readyForSale(){
//        grayCarConfiguration = new GrayColourCarConfiguration();
        redColourCarConfiguration = new RedColourCarConfiguration();
      //  return "Car ready in " + grayCarConfiguration.makeConfiguration();
        return "Car ready in " + redColourCarConfiguration.makeConfiguration();
    }*/

    /*private Configurable configuration;
    public String readyForSale(){
        //configuration = new RedColourCarConfiguration();
        configuration = new GrayColourCarConfiguration();
        return "Car ready in " + configuration.makeConfiguration();
    }*/

    private Configurable configuration;

    public Car(Configurable configuration) {
        this.configuration = configuration;
    }

    public String readyForSale() {
        return "Car ready in " + configuration.makeConfiguration();
    }

}
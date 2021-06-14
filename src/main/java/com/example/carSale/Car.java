package com.example.carSale;

public class Car {
  //  private YellowCarConfiguration yellowCarConfiguration;
    private GreenCarConfiguration greenCarConfiguration;

    public String readyForSale(){
//        yellowCarConfiguration = new YellowCarConfiguration();
        greenCarConfiguration = new GreenCarConfiguration();
      //  return "Car ready in " + yellowCarConfiguration.makeConfiguration();
        return "Car ready in " + greenCarConfiguration.makeConfiguration();
    }



}

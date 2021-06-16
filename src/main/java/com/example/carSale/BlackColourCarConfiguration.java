package com.example.carSale;

/*public class RedColourCarConfiguration {
    public String makeConfiguration(){


        return "Red_Configuration";
    }


}*/


public class BlackColourCarConfiguration implements Configurable{


    @Override
    public String makeConfiguration() {
        return "Red_Configuration";
    }
}

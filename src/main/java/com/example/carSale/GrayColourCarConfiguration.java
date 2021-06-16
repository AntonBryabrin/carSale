package com.example.carSale;

/*public class GrayColourCarConfiguration {
    public String makeConfiguration(){


        return "Gray_Configuration";
    }


}*/

public class GrayColourCarConfiguration implements Configurable{


    @Override
    public String makeConfiguration() {
        return "Gray_Configuration";
    }
}

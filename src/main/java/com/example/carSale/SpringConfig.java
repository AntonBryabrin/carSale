package com.example.carSale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.carSale")

public class SpringConfig {
    @Bean
    public GrayColourCarConfiguration grayColourCarConfiguration(){
        return new GrayColourCarConfiguration();

    }

    @Bean
    public BlackColourCarConfiguration blackColourCarConfiguration(){
        return new BlackColourCarConfiguration();
    }

    @Bean
    public PinkColourCarConfiguration pinkColourCarConfiguration(){
        return new PinkColourCarConfiguration();
    }

    @Bean
    public RedColourCarConfiguration redColourCarConfiguration(){
        return new RedColourCarConfiguration();
    }


    @Bean
    public Car menCar(){
        return new Car(blackColourCarConfiguration());
    }

    @Bean
    public Car familyCar(){
        return new Car(grayColourCarConfiguration());
    }

    @Bean
    public Car girlCar(){
        return new Car(pinkColourCarConfiguration());
    }

    @Bean
    public Car teenCar(){
        return new Car(redColourCarConfiguration());
    }




}

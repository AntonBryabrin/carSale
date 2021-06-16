package com.example.carSale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarSaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarSaleApplication.class, args);

		Car carForFamily = new Car(new GrayColourCarConfiguration());
		System.out.println(carForFamily.readyForSale());

		Car carForMen = new Car(new BlackColourCarConfiguration());
		System.out.println(carForMen.readyForSale());

		Car carForGirl = new Car(new PinkColourCarConfiguration());
		System.out.println(carForGirl.readyForSale());

		Car carForTeen = new Car(new RedColourCarConfiguration());
		System.out.println(carForTeen.readyForSale());


	}




}

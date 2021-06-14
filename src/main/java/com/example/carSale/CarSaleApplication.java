package com.example.carSale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarSaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarSaleApplication.class, args);

		Car carForFamily = new Car();
		System.out.println(carForFamily.readyForSale());

		Car carForMen = new Car();
		System.out.println(carForMen.readyForSale());


	}




}

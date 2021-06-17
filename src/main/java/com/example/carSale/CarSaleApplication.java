package com.example.carSale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class CarSaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarSaleApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Car newCarForFamily = context.getBean("familyCar", Car.class );
		Car newCarForMen = context.getBean("menCar", Car.class);
		Car newCarForTeen = context.getBean("teenCar", Car.class);
		Car newCarForGirl = context.getBean("girlCar", Car.class);

		System.out.println(newCarForFamily.readyForSale());
		System.out.println(newCarForMen.readyForSale());
		System.out.println(newCarForTeen.readyForSale());
		System.out.println(newCarForGirl.readyForSale());



	}




}

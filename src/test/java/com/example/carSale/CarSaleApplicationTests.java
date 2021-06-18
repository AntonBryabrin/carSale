package com.example.carSale;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

@SpringBootTest
class CarSaleApplicationTests {

	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

	@Test
	void contextLoads() {
		Car glamourCar = context.getBean("girlCar", Car.class);
		String result = glamourCar.readyForSale();

		Assert.isTrue(result.equals("Car ready in Pink_Configuration"),"result is not \"Car ready in Pink_Configuration\"");



	}




}

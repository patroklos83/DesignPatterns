package com.patroklos.builder;

public class BMWCarBuilder extends CarBuilder {

	@Override
	public void buildCar() {
		car.setBrand("BMW");
		car.setId(1);
		car.setModel("318i");
		car.setRegNo("ABC12345");
		car.setYearManufactured(2020);
	}
}
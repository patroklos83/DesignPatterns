package com.patroklos.builder;

public class AppBuilder {

	public static void main(String[] args) {
		
		 CarFactory carFactory = new CarFactory();
		 CarBuilder builder = new BMWCarBuilder();
		 
		 carFactory.setCarBuilder(builder);
		 carFactory.constructCar();

		 System.out.println(carFactory.getCar().getBrand());
		 System.out.println(carFactory.getCar().getModel());

	}

}

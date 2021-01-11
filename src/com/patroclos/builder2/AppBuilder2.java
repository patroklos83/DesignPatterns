package com.patroclos.builder2;

import com.patroclos.builder2.Car;

public class AppBuilder2 {

	public static void main(String[] args) {
		
		Car car = new Car
				.Builder(2)
				.setModel("toyota")
				.setYearManufactured(1998)
				.build();
		System.out.println(car.toString());
	}

}

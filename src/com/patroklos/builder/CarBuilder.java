package com.patroklos.builder;

public abstract class CarBuilder {
	
	protected Car car;
	
	public Car getCar() {
        return car;
    }

    public void createNewCar() {
        car = new Car();
    }

    public abstract void buildCar();

}

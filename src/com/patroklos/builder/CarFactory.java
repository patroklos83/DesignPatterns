package com.patroklos.builder;

class CarFactory {
	
    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder builder) {
        carBuilder = builder;
    }

    public Car getCar() {
        return carBuilder.getCar();
    }

    public void constructCar() {
    	carBuilder.createNewCar();
    	carBuilder.buildCar();
    }
}
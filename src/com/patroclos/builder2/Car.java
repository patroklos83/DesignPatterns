package com.patroclos.builder2;

public class Car {
	
	private int id;
	private String model;
	private int yearManufactured;


	public int getId() {
		return id;
	}


	public String getModel() {
		return model;
	}


	public int getYearManufactured() {
		return yearManufactured;
	}


	public static class Builder{
		
		private int id;
		private String model;
		private int yearManufactured;
		
		public Builder(int id) {
			this.id = id;
		}
		
		public Builder setModel(String model) {
			this.model = model;
			return this;
		}
		
		public Builder setYearManufactured(int yearManufactured) {
			this.yearManufactured = yearManufactured;
			return this;
		}
		
		public Car build() {
			Car car = new Car();
			car.id = this.id;
			car.model = this.model;
			car.yearManufactured = this.yearManufactured;
			return  car;
			
		}
		
		
	}
	
	 @Override
	    public String toString() 
	    { 
	        return "carid: " + this.id + " " + 
					   "carModel: " + this.model + " " + 
					   "year: " + this.yearManufactured ;
	    } 

}

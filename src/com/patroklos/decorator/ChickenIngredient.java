package com.patroklos.decorator;

public class ChickenIngredient extends SaladDecorator {

	public ChickenIngredient(ISalad salad) {
		super(salad);
	}

	public String addIngredient() {
		return super.addIngredient() + " " + prepareChickenPieces();
	}

	
	private String prepareChickenPieces() {
		System.out.println("Cutting chicken into small pieces...");
		return "Chicken";
	}
	
}

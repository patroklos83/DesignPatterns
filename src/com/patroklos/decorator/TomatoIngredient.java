package com.patroklos.decorator;

public class TomatoIngredient extends SaladDecorator{

	public TomatoIngredient(ISalad salad) {
		super(salad);
	}
	
	public String addIngredient() {
		return super.addIngredient() + " " + prepareTomatoes();
	}
	
	private String prepareTomatoes() {
		System.out.println("preparing tomatoes...");
		return "Tomatoes";
	}

}

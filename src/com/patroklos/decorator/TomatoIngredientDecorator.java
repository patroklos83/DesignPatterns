package com.patroklos.decorator;

public class TomatoIngredientDecorator extends SaladDecorator{

	public TomatoIngredientDecorator(ISalad salad) {
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

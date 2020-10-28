package com.patroklos.decorator;

public abstract class SaladDecorator implements ISalad {

	private ISalad salad;
	
	public SaladDecorator(ISalad salad) {
		this.salad = salad;
	}
	
	@Override
	public String addIngredient() {
		return salad.addIngredient();
	}

}

package com.patroklos.decorator;

public class DecoratorPattern {

	public static void main(String[] args) {
		ISalad salad = new ChickenIngredientDecorator(new Salad());
		System.out.println("Chicken Salad");
		System.out.println("-------------");
		System.out.println(salad.addIngredient());
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Chicken/Tomato Salad");
		System.out.println("-------------");
		ISalad salad2 = new ChickenIngredientDecorator(new TomatoIngredientDecorator(new Salad()));
		System.out.println(salad2.addIngredient());
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Double Chicken/Tomato Salad");
		System.out.println("-------------");
		ISalad salad3 = new ChickenIngredientDecorator(new ChickenIngredientDecorator(new TomatoIngredientDecorator(new Salad())));
		System.out.println(salad3.addIngredient());
	}

}

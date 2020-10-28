package com.patroklos.decorator;

public class DecoratorMain {

	public static void main(String[] args) {
		ISalad salad = new ChickenIngredient(new Salad());
		System.out.println("Chicken Salad");
		System.out.println("-------------");
		System.out.println(salad.addIngredient());
		System.out.println("-------------");
		System.out.println("Chicken/Tomato Salad");
		System.out.println("-------------");
		ISalad salad2 = new ChickenIngredient(new TomatoIngredient(new Salad()));
		System.out.println(salad2.addIngredient());
	}

}

package com.patroclos.singleton;

public class TestSingletonMain {

	public static void main(String[] args) {
		
		TestSingleton singletonInstance = TestSingleton.getInstance();
		System.out.println(singletonInstance.hashCode());
		singletonInstance = TestSingleton.getInstance();
		System.out.println(singletonInstance.hashCode());
		
		//Invalid call to singleton.Used only for the tutorial
		singletonInstance = TestSingleton.createAnotherInstance();
		System.out.println(singletonInstance.hashCode());
	}

}

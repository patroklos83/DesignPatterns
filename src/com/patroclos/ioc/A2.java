package com.patroclos.ioc;

public class A2 {
	
	B b;

	public A2() {
		b = Factory.GetB();
	}
	
	public void run() {
		b.doTask();
	}
	
}

package com.patroclos.ioc;

public class A {

	B b;
	
	public A() {
		b = new B();
	}
	
	public void run() {
		b.doTask();
	}
}

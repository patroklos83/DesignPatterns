package com.patroclos.facade;

public class FacadeMain {

	public static void main(String[] args) {
		
		Object contract = new Object(); //test sample Object
		ProcessFacade processFacade = new ProcessFacade();	
		processFacade.startProcess(contract);

	}

}

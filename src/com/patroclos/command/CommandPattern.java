package com.patroclos.command;

import java.util.ArrayList;
import java.util.Arrays;

public class CommandPattern {

	public static void main(String[] args) {
		
		//Create the new contract
		Contract contract = new Contract();
		contract.setContractid("1");
		contract.setCustomerName("Test Customer");
		contract.setServices(new ArrayList<>(Arrays.asList(new String[]{"service1","service2"})));
		
		//initialize the processes
		CreateContractProcess createContract = new CreateContractProcess(contract);
	    CancelContractProcess cancelContract = new CancelContractProcess(contract);			
		
		//use process manager to delegate the process
		ProcessManager processManager = new ProcessManager();
		processManager.addProcess(createContract);
		processManager.addProcess(cancelContract);
		processManager.execute();
		

	}

}

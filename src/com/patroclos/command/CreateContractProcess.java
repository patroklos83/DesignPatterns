package com.patroclos.command;

public class CreateContractProcess implements Process {

	private Contract contract;
	
	public CreateContractProcess(Contract contract) {
		this.contract = contract;
	}
	
	@Override
	public void execute() {
		contract.createContract();
	}

}

package com.patroclos.command;

public class CancelContractProcess implements Process {

	private Contract contract;
	
	public CancelContractProcess(Contract contract) {
		this.contract = contract;
	}
	
	@Override
	public void execute() {
		contract.cancelContract();
	}

}

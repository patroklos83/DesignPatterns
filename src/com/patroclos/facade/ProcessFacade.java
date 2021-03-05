package com.patroclos.facade;

public class ProcessFacade implements Facade{

	@Override
	public void startProcess(Object contract) {
		isUserAuthorised();
		
		ContractService contractService = new ContractService();
		BillingService billingService = new BillingService();
		CustomerService customerService = new CustomerService();
		
		customerService.createCustomer(contract);
		contractService.createContract(contract);
		billingService.createBillingRecord(contract);
		
		log();
	}

	@Override
	public void log() {
	    System.out.println("Logging contract creation...");	
	}

	@Override
	public boolean isUserAuthorised() {
		//check User's permissions
		System.out.println("Verifying user...");	
		return true;
	}

}

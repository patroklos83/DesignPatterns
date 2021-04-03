package com.patroclos.ioc;

public class ContractBusinessLogic {
	
	ContractDAO contractDao;
	
	public ContractBusinessLogic() {
		contractDao = new ContractDAO();
	}
	
	public void createContract(Contract contract) {
		contractDao.saveContract(contract);
	}

}

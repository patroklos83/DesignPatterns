package com.patroclos.ioc;

public class ContractBusinessLogic2 {

	ContractDAO contractDao;
	
	public ContractBusinessLogic2() {
		contractDao = DAOFactory.GetContractDAO();
	}
	
	public void createContract(Contract contract) {
		contractDao.saveContract(contract);
	}

}

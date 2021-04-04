package com.patroclos.dependencyinjection;

import com.patroclos.ioc.Contract;

public class ContractBusinessLogic1 {

	IContractDAO dataAccess;

    public ContractBusinessLogic1()
    {
        dataAccess = DAOFactory.GetContractDAO();
    }

    public void createContract(Contract contract)
    {
        dataAccess.saveContract(contract);
    }
	
}

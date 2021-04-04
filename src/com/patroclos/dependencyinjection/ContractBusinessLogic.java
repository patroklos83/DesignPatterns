package com.patroclos.dependencyinjection;

import com.patroclos.ioc.Contract;

public class ContractBusinessLogic
{
	IContractDAO dataAccess;

    public ContractBusinessLogic(IContractDAO custDataAccess)
    {
        dataAccess = custDataAccess;
    }

    public void createContract(Contract contract)
    {
        dataAccess.saveContract(contract);
    }
}
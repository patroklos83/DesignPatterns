package com.patroclos.dependencyinjection;

import com.patroclos.ioc.Contract;

public class ContractDAO implements IContractDAO
{
    public ContractDAO()
    {
    }

	@Override
	public void saveContract(Contract contract) {
		System.out.println("Contract saved in db");
	}
}
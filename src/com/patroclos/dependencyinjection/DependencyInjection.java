package com.patroclos.dependencyinjection;

import com.patroclos.ioc.Contract;
import com.patroclos.singleton.TestSingleton;

public class DependencyInjection {

	public static void main(String[] args) {
		
		ContractBusinessLogic contractBL = new ContractBusinessLogic(new ContractDAO());
		Contract contract = new Contract();
		contract.setContractId(1);
		contractBL.createContract(contract);
	}
}

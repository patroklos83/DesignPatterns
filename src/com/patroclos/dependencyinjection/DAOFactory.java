package com.patroclos.dependencyinjection;

public class DAOFactory {
	
	public static IContractDAO GetContractDAO() {
		return new ContractDAO();
	}

}

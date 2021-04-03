package com.patroclos.ioc;

public class DAOFactory {
	
	public static ContractDAO GetContractDAO() {
		return new ContractDAO();
	}

}

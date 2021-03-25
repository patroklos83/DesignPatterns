package com.patroclos.command;

import java.util.List;

public class Contract {

	private String contractid;
	private String customerName;
	private List<String> services;
	
	public String getContractid() {
		return contractid;
	}
	public void setContractid(String contractid) {
		this.contractid = contractid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public List<String> getServices() {
		return services;
	}
	public void setServices(List<String> services) {
		this.services = services;
	}
	
	public void createContract() {
		System.out.println("Creating Contract...");
		for(String service: services) {
			System.out.println("adding service " + service);
		}
		System.out.println("Contract " + contractid + " created");
	}
	
	public void cancelContract() {
		System.out.println("Cancelling Contract...");
		for(String service: services) {
			System.out.println("removing service " + service);
		}
		System.out.println("Contract " + contractid + " canceled");
	}
	
	
}

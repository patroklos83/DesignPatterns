package com.patroclos.command;

public class ProcessManager {
	
	private Process process;
	
	public ProcessManager(Process process) {
		this.process = process;		
	}
	
	public void run(){
		
		log();
		
		if (!isUserAutorized()) {
			return;
		}
		
		process.execute();
	}
	
	
	private boolean isUserAutorized() {
		//user authorization code
		//for this example create Contract always return true	
		if (process.getClass().getSimpleName().equals(CancelContractProcess.class.getSimpleName())) {
			System.out.println("User not authorized to execute process " + process.getClass().getName());	
			return false;
		}
		System.out.println("User authorized to execute process " + process.getClass().getName());	
		return true;
	}
	
	private void log() {
		System.out.println("Executing " + process.getClass().getSimpleName());
	} 

}

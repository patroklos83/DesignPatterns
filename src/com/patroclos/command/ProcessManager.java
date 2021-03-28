package com.patroclos.command;

import java.util.ArrayList;
import java.util.List;

public class ProcessManager {

	private List<Process> processes;

	public ProcessManager() {
		this.processes = new ArrayList<Process>();		
	}

	public void addProcess(Process process) {
		processes.add(process);
	}

	public void execute(){

		for(Process process:processes)
		{
			log(process);

			if (!isUserAutorized(process)) {
				return;
			}

			process.execute();
		}
	}


	private boolean isUserAutorized(Process process) {
		//user authorization code
		//for this example create Contract always return true	
		if (process.getClass().getSimpleName().equals(CancelContractProcess.class.getSimpleName())) {
			System.out.println("User not authorized to execute process " + process.getClass().getName());	
			return false;
		}
		System.out.println("User authorized to execute process " + process.getClass().getName());	
		return true;
	}

	private void log(Process process) {
		System.out.println("Executing " + process.getClass().getSimpleName());
	} 

}

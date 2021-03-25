package com.patroclos.facade;

public interface Facade {
	
    void startProcess(Object contract);
    
    void log();
    
    boolean isUserAuthorised();
}
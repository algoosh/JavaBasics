package com.WednesdayClass;

public class GameConsole {
//creat list of instance variables

	// creat childs classes


	String controller;
    int numberOfController;
    String powerSource;
    boolean cd;
    boolean ifTvNeeded;
    
    void ableToPlay() {
        System.out.println("I can play Games");
    }
    
    void readDisk() {
        System.out.println("i can read disk");
    }
    
    boolean surfWeb() {
        return true;
    }
    
    boolean portable() {
        return false;
    }
    
}

package com.class25;

public class SyntaxStudent extends Student {

	public void study() {
		System.out.println("Syntax Students must study hard");

	}

	public void doHomeWork() {
		System.out.println("Syntax Students must do repl");
	}
	public void attandClasses() {
		 System.out.println("Syntax St must attand class");
	 }
	
	private void doResearch() {////private method can't be overridden
		System.out.println("Syntax Students must do homework usuing Google");
}
}

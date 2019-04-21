package com.class25;

public class FinalKeyword {/*using a word FINAL (public final class) we are
	Preventing inheritance 
	that means we can not have other Children classes*/
	
public static final String name="Syntax";

	public static void main(String[] args) {
		/*final keyword can me used in 3 places: 
		 * 1.final variables--> can t be change their value---> constant; 
		 * 2.final method--> we can not override final methods; 
		 * 3.classes;*/
final String str="Hello";//constant variables CANT BE change;
// name="School";

	}
public final void hello() {
	System.out.println("Hello from Parent class");
}
}
class ChildOfFinal extends FinalKeyword{
	
}
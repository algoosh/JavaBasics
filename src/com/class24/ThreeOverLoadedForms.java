package com.class24;

public class ThreeOverLoadedForms {
	
	
static void someMethod(int x, String name) {
		System.out.println("This is a method with different paraments ");
		
	}
public static void main(String[] args) {
	ThreeOverLoadedForms obj=new ThreeOverLoadedForms();
	obj.someMethod(5, "Cat");
}

}

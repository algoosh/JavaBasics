package com.class25;

public class Animal {
public static void whoAmI() {
	System.out.println(" I am animal");
}
}
class Poppy extends Animal{
	/*CANNOT OVERRIDE THE STATIC METHOD WITH INSTANCE
	public void whoAmI() {
		System.out.println(" I am poppy");
	}*/
}
class Monkey extends Animal{
	public static void whoAmI() {
		System.out.println(" I am monkey");
	
	}
}

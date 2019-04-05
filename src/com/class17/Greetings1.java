package com.class17;

public class Greetings1 {

	public static void main(String[] args) {

		Greetings1 obj = new Greetings1();
		obj.askHowAreYou2("Mike");//change You or you1 or you2 will print that particular syso
	}

	void askHowAreYou(String name) {
		System.out.println("How are you " + name);// the one that changes send it to parameters

	}

	void askHowAreYou1(String name) {
		System.out.println("How are you " + name);// the one that changes send it to parameters
	}

	void askHowAreYou2(String name) {
		System.out.println("How are " + name);// the one that changes send it to parameters
		////FTER CREATING ALL     VOID     create lines 7 and 8
	}
}

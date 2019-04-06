package com.class17;

public class NoMainMethod {
	String str;
	int num;//VATIABLES MUST TO BE INSIDE THE CLASS BUT OUTSIDE METHOD

	void hello()

	{

		System.out.println("hello");
		System.out.println("");
		System.out.println("hello");
		
		System.out.println();// all lines will printed then jump to line#26 and will look for a match
	}

	void bye() {
		System.out.println("Bye");// from her, after prints all lines will go to line 27
		System.out.println();
		System.out.println();
	}

	public static void main(String[] args) {// main signature

		NoMainMethod obj = new NoMainMethod(); // main body)
		obj.hello();
		obj.bye();// from like 14 will go to this line
		
		//DEBUG TO SEE HOW THIS WORK
	}
	void howAreYou() {//each method MUST to be out side other method
		
	}
}

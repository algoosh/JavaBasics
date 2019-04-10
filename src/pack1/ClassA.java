package pack1;

public class ClassA {

	int Lines = 0;
	String Color = "";
	protected int pictures = 6;
	
	// this doesn't need an instance to use
	static int Cups = 2;

	public static void main(String[] args) {
		
		// Static variables exist on the Type not on an instance of the Type
		//System.out.println("Show me the static variable on A" + ClassA.Cups);
		
		// These are instances on the Types : ClassA, ClassB, ClassC, ClassD, ClassE
		ClassA a = new ClassA();
		
		// B inherits from A
		ClassB b = new ClassB();
		
		// C doesn't inherit from A
		ClassC c = new ClassC();

		//D inherits from A
		ClassD d = new ClassD();
		
		//E inherits from D
		ClassE e = new ClassE();

		
		System.out.println("Show me Inheritance from ClassA " + b.Color + b.Lines);
		System.out.println("Show me ClassB property seats" + b.seats );
		
		System.out.println("show me ClassC property people " + c.people);
		
		System.out.println("ClassD doesn't show private methods" );
		
		System.out.println("show me ClassE seats" + e.seats);
		
		System.out.println("show me ClassE somemethod");
		
		// e.SomeMethods() 
		
		
		
	}
}

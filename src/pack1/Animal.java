package pack1;

// Classes can be Type
// The Type or Class is an Animal

// Type a.k.a "class" "Animal" 
//            ==> Instance a.k.a. "object" "zebra" 
//               ==> Properties 
//                   ==> Methods 
//                     ==> Constructor



public class Animal {

	// "name" exists on the "Animal" Type
	static String name = "Anna";

	String breed = "husky";
	int age = 3;
	double weight = 100;


	
	// Usually only one in a "program"
	// What is a "program"? 
	// You could have a 100 ".java" 
	// in your program and the "main" method is where it starts
	public static void main(String[] args) {
		
		// For example Chrome is a bunch of compiled files
		// assuming its Java
		// there is one file with a 
		//	"public static void main(String[] args)"
		// That you can pass args "arguments" to
		// For example 
		//  chrome.exe --reset-variation-state
		// in this case you are sending String[] = ["--reset-variation-state"]
		// Have instance of mammal, reptile and animal
		Mammal camel = new Mammal();
		Reptile cobra = new Reptile();
		Animal zebra = new Animal();
		
		System.out.println("What does the mammal say: " + camel.Speak());
		System.out.println("What does the reptile say: " + cobra.Speak());
		System.out.println("What does the reptile say: " + zebra.Speak());
		
		System.out.println("What does the mammal say: " + Mammal.Speaks());
		System.out.println("What does the reptile say: " + Reptile.Speaks());
		System.out.println("What does the reptile say: " + Animal.Speaks());
		
		// Static variable that is on the Type "Animal"
		System.out.println("How many animals: " + Animal.name);
		
		// Instance variable age is on "animal"
		System.out.println("How many animals: " + zebra.age);
		
		
		
	}

	String Speak() {
		return "Yells";
	}
	
	static String Speaks() {
		return "Yelled";
	}
	
	boolean canBark() {
		return true;
	}
	
	static int numberOfAnimals = 4;

	boolean isWild() {
		return true;
	}
}

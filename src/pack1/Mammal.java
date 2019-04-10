package pack1;

// The type is Mammal

public class Mammal {
	
	// Mammal mammal = new Mammal();
	// Mammal is the Type
	// mammal is the runtime object
	// Mammal() is a special method called a "constructor"

	// This method has no parameters and is called the "default" constructor
	public Mammal() {
		
	}
	// Because no static, You have to initiate a Mammal Object to use
	public String Speak() {
		return "Bark";
	}
	
	static String Speaks() {
		return "Barked";
	}
}
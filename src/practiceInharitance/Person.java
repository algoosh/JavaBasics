package practiceInharitance;

class Person {
	//Person(String name, String lastName, int age) {
//System.out.println(name + " " + lastName + " " + age);
	String name;
	String lastName; 
	int age;
	int salery;
	
}

class Employee extends Person{
	int salery;
	public void em() {
		
		System.out.println(name + " " + lastName + " " + age+" "+salery);	
	}
}

class Student extends Person{
	int grade;
	public void st() {
		System.out.println(name + " " + lastName + " " + age+" "+grade);
		
	}
}

class Retiree extends Person {
	String seniorActivity;
	public void re() {
		System.out.println(name + " " + lastName + " " +age+" "+seniorActivity);
		
	}
}
package Inheritance;

public class Test extends Parent1 {

	public static void main(String[] args) {
		Parent1 obj=new Parent1();
		System.out.println(obj.day("second"));
		System.out.println(obj.day("one", "two"));

	
	}
}

package practiceInharitance;

public class Addition1 {
	void sum(int a, int b) {
		System.out.println("The sum of integers is " + (a + b));
	}
	void sum(double a,double b) {
		System.out.println("the sum of doubles is "+(a+b));
	}
	public static void main(String[] args) {
		Addition1 obj=new Addition1();
		obj.sum(10, 10);
		obj.sum(5.7, 8.9);
	}
}

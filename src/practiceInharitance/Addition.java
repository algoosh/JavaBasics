package practiceInharitance;

public class Addition {
	void sum(int a, int b) {
		System.out.println("sum of numbers is " + (a + b));
	}

	void sum(int a, int b, int c) {
		System.out.println("sum of numbers is " + (a + b + c));
	}
	public static void main(String[] args) {
		Addition obj=new Addition();
		obj.sum(10, 15);
		obj.sum(10, 15, 20);
	}
}

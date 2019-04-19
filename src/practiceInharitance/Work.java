package practiceInharitance;

public class Work {
	public void getHours() {
		System.out.println("My work starts at 6am");

	}

	void getHours(double a) {
		System.out.println("My work starts " + a);
	}
	public static void main(String[] args) {
		Work obj=new Work();
		obj.getHours();
		obj.getHours(8.30);
		obj.getHours(9.30);
		
	}
}

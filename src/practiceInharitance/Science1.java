package practiceInharitance;

class Science1 extends DA {
	float bonus = 2000;

	public static void main(String args[]) {
		Science1 obj = new Science1();
		obj.total_sal = obj.salary + obj.hra + obj.da + obj.bonus;
		System.out.println("Total Salary is:" + obj.total_sal);

	}
}
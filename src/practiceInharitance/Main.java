package practiceInharitance;

public class Main {
/*Joe Smith 35 35000
Adam Smith 15 10
Frank Smith 15 tour*/
	public static void main(String[] args){
		Employee x=new Employee();
		x.name=("Joe");
		x.lastName= ("Smith");
		x.age=(35);
		x.salery=(35000);
		x.em();
		Student y=new Student();
		y.name=("Adam");
		y.lastName=("Smith");
		y.age=(15);
		y.grade=(10);
		y.st();
		Retiree z=new Retiree();
		z.name=("Frank");
		z.lastName=("Smith");
		
		z.age=(15);
		z.seniorActivity=("tour");
		z.re();
		}
	}
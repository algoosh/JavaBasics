package constructorPractices;

public class SyntaxTechnologies {
	 String schoolName;
	 int batch;
	 String year;
	 String lastDayOfClass;
	SyntaxTechnologies(){
		System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
	}
	SyntaxTechnologies(String schoolName,int batch,String year, String lastDayOfClass){
		System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
		
	}
	public static void main(String[] args) {
		SyntaxTechnologies obj=new SyntaxTechnologies();
		
	}
}

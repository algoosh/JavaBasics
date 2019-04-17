package constructorPractices;

class MainCalling3Times {
	static String ss = "Welcome To Syntax Solutions";
	public static void main(String[] args) {
		
		
		MainCalling3Times obj = new MainCalling3Times();
		System.out.println(ss);

		System.out.println(MainCalling3Times.ss);

		
              System.out.println(obj.ss);
	}
}

package practiceInharitance;

class Main1 {
	  public static void main(String[] args) {
		  B x=new B();
		  System.out.println(x.i);
	  }
	} 
	  class A{
	  int i=10;    
	}
	class B  extends A{
	 int i=20;
	  
	}
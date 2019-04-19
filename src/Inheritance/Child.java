package Inheritance;

public class Child extends Parent{

    Child(){
//        for(int i=0;i<10;i++) {
//            System.out.println("I am from Child Class");
//        }
        //System.out.println("I am from Child Class");
    }
    public static void main(String[] args) {
        Child child=new Child();
        System.out.println(child.reverse("first"));
        System.out.println(child.reverse("first", "second"));

    }

}

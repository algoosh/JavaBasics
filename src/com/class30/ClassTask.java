package com.class30;
/*Create a generic ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that*/

import java.util.ArrayList;

public class ClassTask {
public static void main(String[] args) {
        
        ArrayList<String> names=new ArrayList<String>();
        names.add("John");
        names.add("Jack");
        names.add("Nick");
        names.add("Sam");
        names.add("Mimi");
        if(names.size()==0) {
        	System.out.println("empty");
        }else {
        	System.out.println("not empty");
        }
        if(names.contains("Sam")) {
        	System.out.println(names.get(3));
        }else {
        	System.out.println("not contains ");
        }
        
//        if (names.size()==0) {
//            System.out.println("empty");
//        }else {
//            System.out.println("not empty");
//        }
//        
//        System.out.println(names.isEmpty());
//        
//        if (names.contains("Jack")) {
//            System.out.println("Contains this name");
//        }else {
//            System.out.println("not contains this name");
//        }
//        for (int a=0;a<names.size();a++) {
//            System.out.println(names.get(a));
//        }
    }
    
//needs to review!

}


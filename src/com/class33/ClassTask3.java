package com.class33;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ClassTask3 {
/*Create a map of countries with its capital. 
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.*/
	public static void main(String[] args) {
		
		Map<String,String> obj=new HashMap<>();
		
		obj.put("Germany", "Berlin");
		obj.put("Italy", "Vienna");
		obj.put("France", "Paris");
		obj.put("Britan", "London");
		obj.put("Egypt", "Kabul");
		
		System.out.println(obj);
		
		
		System.out.print("This is all Values form collection using each Loop ");
		Collection <String> w=obj.values();
		for(Object a:w) {
			System.out.print( a + ", ");
		}
			Iterator<String> obj1=w.iterator();
			while(obj1.hasNext()) {
				System.out.println(obj1.next());
			}	
			Set<String> keys=obj.keySet();
			for(Object w1:keys) {
				System.out.println(w1);
			}
			}
		

	}



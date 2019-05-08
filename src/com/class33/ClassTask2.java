package com.class33;

import java.util.HashMap;
import java.util.Map;

public class ClassTask2 {
	/*Create a map of a building. Store floor number and it is associated company name.
	 *  (Example: 1= Google, 2=Syntax etc..). 
	 *  Insert 7 entries with duplicate keys and values.
Check how many entries you have//size
Update company on a 4th floor//.replace
Remove company on the 7th floor//.remove
Print your map*/

	public static void main(String[] args) {
		Map <Integer,String> a=new HashMap<>();
		a.put(1,"Google"); 
		a.put(1, "German");
		a.put(2,"Syntax");
		a.put(2,"Google");
		a.put(3, "Sasha");
		a.put(3,"Window"); 
		a.put(4,"Apple"); 
		a.put(5,"Google"); 
		a.put(5, "Manel");
		a.put(6,"Amazon");
		a.put(7,"Netflix");
		a.put(1,"Olga");
		a.put(2, "Elga");
		a.put(2, "Key");
		
		System.out.println(a.size());
		a.replace(4,"AGA");
		System.out.println(a.get(4));
		a.remove(7);
		System.out.println(a.size());
		System.out.println(a);

	}

}

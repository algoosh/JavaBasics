package com.class34;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapReview1 {
	// create a map of grocery products and it is quantity
	public static void main(String[] args) {
Map<String, Integer> groceryMap = new LinkedHashMap<>();
		groceryMap.put("Milk", 1);
		groceryMap.put("Bread", 2);
		groceryMap.put("Eggs", 12);
		groceryMap.put("Coffee", 2);
		groceryMap.put("Potato", 2);
		groceryMap.put("Cookies", 3);

		// retrieving all keys+values using keySet();
		Set<String> keySet = groceryMap.keySet();
		for (String key : keySet) {
System.out.println("Key is "+key+" and values is "+groceryMap.get(key));}

//-----------------------Iterator is NOT ACCURATE-----------------------------
		
		/*Iterator<String> keyIt= keySet.iterator();
		while(keyIt.hasNext()) {
			String key=keyIt.next();
			System.out.println(key+":"+groceryMap.get(key));
		}*/
//--------------------------------------------------------------------------
		}
	}
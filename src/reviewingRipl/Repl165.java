package reviewingRipl;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repl165 {
	
		  public static void main(String[]args){
		    
		    Map<String,String> map=new HashMap<>();
		    map.put("ONE","AAA");
		map.put("TWO","BBB");
		map.put("THREE","CCC");
		map.put("FOUR","DDD");
		map.put("FIVE","EEE");
		System.out.println("HashMap Before Replace :");
Set<Entry<String,String>>set=map.entrySet();
		    for(Entry<String,String> entry :set){
		      System.out.println(entry.getKey()+":"+entry.getValue());
		    }
		    System.out.println("-------------------------");
		  
		    map.replace("THREE","ASEL");
		    map.replace("FIVE","SUMAIR");
System.out.println("HashMap Before Replace :");
Set<Entry<String,String>>set1=map.entrySet();
for(Entry<String,String> entry :set1){
  System.out.println(entry.getKey()+":"+entry.getValue());

}}}
		  

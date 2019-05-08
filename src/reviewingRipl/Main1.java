package reviewingRipl;

import java.util.*;
class Main1 {
  public static void main(String[] args) {
   Map<String,String> map=new HashMap<>();
   map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");
System.out.println("HashMap Before Remove :");
{System.out.println(map+":");}

Set<String> keySet = map.keySet();
map.remove("ONE","AAA");
map.remove("FOUR","DDD");
System.out.println("HashMap After Remove :");
for (String key : keySet) {
	
	

System.out.println(key+":"+map.get(key));
}
}

  }

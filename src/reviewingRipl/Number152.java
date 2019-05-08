package reviewingRipl;

import java.util.ArrayList;

public class Number152 {
	
		public static void main(String[] args){
		 ArrayList<Boolean> list=new ArrayList<Boolean>();
		 list.add(true);
		 list.add(false);
		 list.add(false);
		 for(Object a:list){
		   System.out.print(a+" ,");
		   }
		 for(Object a:list){
		   System.out.print(a+" ,");
		   }


		}
		}

		
		/*The modified ArrayList should be

		
		you need to use list.addAll

		
		to modify your arraylist

		and you just printing the existing array twice*/
//----------------------------------another repl--------------------------------------
/*ArrayList<String>list=new ArrayList<>();
  System.out.println(list.isEmpty());
  list.add("Sasha");
  System.out.println(list.isEmpty());
  list.add("Mila");
  System.out.println(list.isEmpty());

  //System.out.println(""+list);

  for (int i=0; i<list.size(); i++) {
    list.get(i);
  }}}*/


package reviewingRipl;

import java.util.ArrayList;

class ReplNumber50{

    public static void main(String[] args)
    {
        ArrayList<String> arrlist=new ArrayList<String>();
        
        arrlist.add("hi");//get removed from 1 iteration
        arrlist.add("yo");//-->0
        arrlist.add("sup");//get removed from 2 second iteration
        arrlist.add("yolo");//-->1
        arrlist.add("boop");
        
        for(int i=0;i<arrlist.size();i++) {
        	System.out.println(i);
            arrlist.remove(i);
        }
        
//        for (Object object : arrlist) {
//            System.out.print(object+" ");
//        }


        
//          public static void main(String[]args){
//        ArrayList<String> x=new ArrayList<>();
//        x.add("hi");
//        x.add("yo");
//        x.add("sup");
//        x.add("yolo");
//        x.add("boop");
//
//        x.remove(0);
//        x.remove(1);
//        x.remove(2);
//        for(Object rand:x){
//          System.out.println(rand);
//        }
        
	
	
	
    }
}
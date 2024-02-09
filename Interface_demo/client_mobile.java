package Interface_demo;

import java.util.*;


class cmp implements Comparator<Mobile>{

	@Override
	public int compare(Mobile o1, Mobile o2) {
		// TODO Auto-generated method stub
		
		double val1= 0.4*o1.review+ 0.6*o1.price;
		double val2= 0.4*o2.review+ 0.6*o2.price;
		
		if(val1>val2) {
			return -1;
		}else {
			return 1;
		}
	}
	
	
}
public class client_mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Mobile> arr= new ArrayList();
      
      Mobile m1= new Mobile(3, 10000,"Apple");
      Mobile m2= new Mobile(5, 100000,"Hp");
      Mobile m3= new Mobile(4, 20000,"Samsung");
      Mobile m4= new Mobile(3, 10000,"Dell");
      
      arr.add(m1);
      arr.add(m2);
      //System.out.println(arr);
      arr.add(m3);
      arr.add(m4);
     // System.out.println(arr);
      Collections.sort(arr,new cmp());
      
      for(int i=0; i<arr.size();i++) {
    	  
    	 arr.get(i).show();
      }
      
	}

}

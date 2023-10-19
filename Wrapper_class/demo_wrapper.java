package Wrapper_class;

import java.util.ArrayList;
import java.util.Collections;

public class demo_wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         
//	   Integer a= new Integer(123);
//	   
//	   Integer b= 13;
//	   
////	   System.out.println(b);
//	   
//	   int c=12;
//	   
//	   b=c; // AutoBoxing :- conversion of primitive data type
//	        // to its corresponding Wrapper Class.
//	   
//	   b= Integer.valueOf(c);
//	   
//	   c=b; // Unboxing// 
//	   
//	   c= b.intValue();
//	   
//	   
//	   Integer d=12;
//	   
//	   Integer e=12;
//	   
//	   Integer d1=300;
//	   
//	   Integer e1= 300;
//	   
//	   if(d==e) {
//		   
//		   System.out.println(" Value is Same");
//	   }else {
//		   System.out.println(" Value is not  Same");
//	   }
//	   
//      if(d1==e1) {
//		   
//		   System.out.println(" Value is Same");
//	   }else {
//		   System.out.println(" Value is not  Same");
//	   }
      
      
	   
      ArrayList<Integer> arr= new ArrayList<>();
      
//	  System.out.println(arr);
	  
	  arr.add(12);
	  
//	  System.out.println(arr);
	  arr.add(30);
//	  System.out.println(arr);
//	  System.out.println(arr.size());
	  arr.add(40);
//	  System.out.println(arr);
	  arr.add(40);
	  System.out.println(arr);
	  arr.set(3, 50);
	   arr.remove(0);
	  System.out.println(arr);
	  
	  Collections.sort(arr);
	  
	  
	   
	  
	  
	  
	  
	  
	   
	   
	   
	   
	   
	  
	   
	   
	}

}

package lec3_1;

import java.util.*;
public class Pattern_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      
      int n= s.nextInt();
      
      int row=1;
      
      int nst=1;
      
      while(row<=2*n-1) {
    	  
    	  // work
    	  // Print Star
    	  
    	   int i=1;
    	   
    	   while(i<=nst) {
    		   System.out.print("*"+" ");
    		   i=i+1;
    	   }
    	   
    	   // Preparation for Next Row
    	    
    	   if(row<n) {
    		   nst=nst+1;
    	   }else {
    		   nst=nst-1;
    	   }
    	   
    	   row=row+1;
    	   System.out.println();
    	   
      }
      
      
	}

}

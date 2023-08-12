package lec3_1;

import java.util.*;
public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      
      int n= s.nextInt();
      
      int row=1;
      
      int nst=n;
      
      int nsp=n-2;
      
      while(row<=n) {
    	  
    	  if(row==1 || row==n) {
    		  
    		  int i=1;
    		  
    		  while(i<=nst) {
    			  System.out.print("*"+" ");
    			  i=i+1;
    		  }
    		  
    	  }else {
    		  
    		  System.out.print("*"+" ");
    		  
    		  // space Print
    		   int j=1;
    		   
    		   while(j<=nsp) {
    			   System.out.print(" "+" ");
    			   j++;
    		   }
    		   
    		   System.out.print("*"+" ");
    		   
    	  }
    	  
    	  // Preparation for Next Row
    	  
    	  row=row+1;
    	  System.out.println();
      }
	}

}

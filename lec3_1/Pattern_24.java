package lec3_1;

import java.util.*;

public class Pattern_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      
      int n= s.nextInt();
      
      int row=1;
      
      int nst=1;
      int nsp=n-1;
      
      int rowval=1;
      
      
       while(row<=n) {
    	   
    	   //  Work
    	   
    	   // Space Print
    	   
    	   int i=1;
    	   
    	   while(i<=nsp) {
    		   System.out.print(" "+" ");
    		   i=i+1;
    	   }
    	   
    	   //Star Print
    	   
    	   int j=1; 
    	   
    	   int colval=rowval;
    	   
    	   while(j<=nst) {
    		   System.out.print(colval+" ");
    		   // Horizontal Mirror
    		   if(j<(nst/2)+1) {
    			   colval=colval+1;
    		   }else {
    			   colval=colval-1;
    		   }
    		   j=j+1;
    	   }
    	   
    	   // Preparation for Next Row
    	   
    	    nst=nst+2;
    	    nsp=nsp-1;
    	    
    	    rowval=rowval+1;
    	    
    	    row=row+1;
    	    System.out.println();
    	   
    	   
       }
	}

}

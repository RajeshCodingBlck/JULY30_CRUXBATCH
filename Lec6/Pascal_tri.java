package Lec6;

import java.util.*;

public class Pascal_tri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       
       int n=s.nextInt();
       
       int row=0;
       
       int nst=1;
       
       int rowval=1;
       
       while(row<n) {
    	   
    	   // work
    	   
    	   // Star Print
    	   
    	   int i=0;
    	   int ncr=rowval;
    	   while(i<nst) {
    		   System.out.print(ncr+" ");
    		   ncr= (ncr*(row-i))/(i+1);
    		   
    		   i++;
    	   }
    	   
    	   // Preparation for the Next Row
    	   
    	   nst=nst+1;
    	   row=row+1;
    	   System.out.println();
       }
	}

}

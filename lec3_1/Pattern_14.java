package lec3_1;

import java.util.*;

public class Pattern_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner s= new Scanner(System.in);
		 
		 int n= s.nextInt();
		 
		 int row=1;
		 
		 int nst=n;
		 int nsp=n-1;
		 
		 
		 while(row<=2*n-1) {
			 
			// work
			 
			 // Space
			 
			 int i=1;
			 
			 while(i<=nsp) {
				 System.out.print(" "+" ");
				 i=i+1;
				 
			 }
			 
			 // Print Star
			 
			 int j=1;
			 
			  while(j<=nst) {
				  System.out.print("*"+" ");
				  j=j+1;
			  }
			  
			  // Preparation for the Next Row
			  
			  if(row<n) {
				  nst=nst-1;
				  nsp=nsp-1;
			  }else {
				  nst=nst+1;
				  nsp=nsp+1;
			  }
			  
			  row=row+1;
			  System.out.println();
		 }
		 
	}

}

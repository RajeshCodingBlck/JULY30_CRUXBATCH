package Lec3;

import java.util.*;

public class Pattern_5 {

	public static void main(String[] args) {
		
		
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();
		
		int row=1;
		
		int nst=n;
	    
		int nsp=0;
		
		while(row<= n) {
			
			//  work
			
			// Print Space
			 
			int i=1;
			
			while(i<=nsp) {
				 // space work
				System.out.print("_"+ " ");
				i=i+1;
			}
			
			// Star Print
			
			int j=1;
			
			while(j<= nst) {
				
				System.out.print("*"+" ");
				j= j+1;
			}
			
			// Preparation for the Next Row
			 nsp=nsp+1;
			 nst=nst-1;
			 System.out.println();
			 row=row+1;
			
	
		}

	}

}

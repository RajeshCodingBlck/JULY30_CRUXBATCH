package lec3_1;

import java.util.*;

public class Patttern_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner s= new Scanner(System.in);
		
		int n=s.nextInt();
		
		int row=1;
		
		int nst= (n/2)+1;
		
		int nsp=-1;
		
		while(row<=n) {
			
			// Left Star
			
			int i=1;
			while(i<=nst) {
				System.out.print("*"+" ");
				i=i+1;
			}
			
			// Space Print
			
			int j=1;
			while(j<=nsp) {
				System.out.print(" "+" ");
				j=j+1;
			}
			
			// Right Star
			int k=1;
			
			if(row==1 || row==n) {
				k=2;
			}
			while(k<=nst) {
				System.out.print("*"+" ");
				k=k+1;
			}
			
			// Preparation for Next Row
			
			 if(row< (n/2)+1) {
				 nst=nst-1;
				 nsp=nsp+2;
			 }else {
				 nst=nst+1;
				 nsp=nsp-2;
			 }
			 
			 row=row+1;
			 System.out.println();
		}
	}

}

package Lec5;

import java.util.Scanner;

public class Prime_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner s=new Scanner(System.in);
		
		int n= s.nextInt();
		
		int count=0;
		
		if(n==1) {
			
			System.out.println("1 is Not a prime");
			
			
		}else {
			

			for(int i=2; i<=n-1;i++) {
				
				if(n%i==0) {
					count++;
					break;
					
				}
			}
			
			if(count>=1) {
				System.out.println(n +" is Not a Prime" );
			}else {
				System.out.println(n+ " is  a Prime" );
			}
		}
	}

}

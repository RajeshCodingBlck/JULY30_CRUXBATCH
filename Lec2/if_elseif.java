package Lec2;

import java.util.Scanner;


public class if_elseif {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
          Scanner sc= new Scanner(System.in);
          
		int a =  sc.nextInt();

		int b = sc.nextInt();

		int c = sc.nextInt();
		
		int d=sc.nextInt();

	    if(a>=b && a>=c && a>=d) {
			
			System.out.println("a is Maximum");
		}else if(b>=a && b>=c && b>=d) {
			
			System.out.println("b is Maximum");
		}else if(c>=a && c>=b && c>=d) {
			
			System.out.println("c is Maximum");
		}else {
			System.out.println("d is Maximum");
		}
		

	}

}

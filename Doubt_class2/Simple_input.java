package Doubt_class2;

import java.util.Scanner;

public class Simple_input {

	  public static void main(String args[]) {
	      
	      Scanner s= new Scanner(System.in);

	       int n= s.nextInt();
	     
	      int presum=0;
	        while(presum+n >=0){

	            System.out.println(n);
	           presum+=n;
	            n= s.nextInt();
	        }

	    }

}

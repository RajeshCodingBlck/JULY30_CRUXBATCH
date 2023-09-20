package Doubt_class2;

import java.util.Scanner;

public class Boston_number {

	 public static int digitSum(int n){

	        int sum=0;

	        while(n>0){

	            int rem= n%10;

	            sum+=rem;

	            n=n/10;
	        }

	        return sum;
	    }
	    
	    public static boolean isPrime(int n){

	        for(int i=2; i<=n-1;i++){

	            if(n%i==0){
	                return false;
	            }
	        }

	        return true;
	    }

	    public static int SumofPrimeFactor(int n){

	       int sum=0;

	         for(int i=2; i<=n;i++){

	             if(n%i==0 && isPrime(i)==true){

	                 int count=0;

	                 while(n%i==0){
	                     count++;
	                     n=n/i;
	                 }
	             
	             sum+= digitSum(i)*count;

	             }
	         }

	         return sum;
	    }

	    public static void main(String args[]) {
	      
	      Scanner s= new Scanner(System.in);

	      int n= s.nextInt();

	      
	       if(digitSum(n)== SumofPrimeFactor(n)){

	           System.out.println(1);
	       }else{
	           System.out.println(0);
	       }
	    }

}

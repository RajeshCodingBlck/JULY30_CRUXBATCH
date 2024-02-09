package Inclusion_exclusion;

import java.util.*;
import java.util.Scanner;

public class Queries_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
      int [] arr= {1,2,3,4,5,6};
      
      int [] prefix= new int[arr.length];
      
      
      for(int i=0;i<arr.length;i++) {
    	  
    	  if(i==0) {
    		  prefix[i]=arr[i];
    	  }else {		  
    		  prefix[i]=prefix[i-1]+arr[i];
    	  }
      }
      
       int q=3;
      
       for(int i=1; i<=q;i++) {
    	   
    	   int l= s.nextInt();
    	   int r= s.nextInt();
    	   // method1
//    	   int sum=0;
//    	   for(int j=l; j<=r;j++) {
//    		   
//    		   sum+=arr[j];
//    	   }  
    	   
    	   int sum;
    	   
    	   if(l !=0) {
    		   sum= prefix[r]-prefix[l-1];
    	   }else {
    		   sum=prefix[r];
    	   }
    	   
    	   System.out.println(sum);
       }
       
       HashSet<Integer> s1= new HashSet();
       
       
      
	}

}

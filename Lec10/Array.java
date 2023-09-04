package Lec10;
import java.util.*;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
//	   int [] arr=null;
//	   
//	   arr= new int[4];
	   
	   
	   
	    
	   int [] arr= new int [5];
	   
	   int [] brr= arr;
	   
	   Scanner s=new Scanner(System.in);
	  
	   for(int i=0;i<5;i++) {
		   
		   arr[i]=s.nextInt();
	   }
	   
	   // Print the Array
	   
	    for(int i=0; i<5;i++) {
	    	System.out.print(arr[i]+" ");
	    }
	    
	   
	   
	   
	   
	   
	   
	}

}

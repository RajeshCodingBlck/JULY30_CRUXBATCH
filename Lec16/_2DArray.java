package Lec16;
import java.util.*;
public class _2DArray {
    public static void fun(int [][] arr) {
    	
    	int noRows= arr.length;
    	int nocol= arr[0].length;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [][]arr=new int [3][4];
      
      int [][] other=arr;
      
      // loop for rows
      
      Scanner s= new Scanner(System.in);
      for(int i=0; i<3;i++) {
    	  
    	  
    	 // loop for colum
    	  
    	  for(int j=0; j<4;j++) {
    		  
//    		  System.out.print("("+i+" "+j+") ");
    		  
    		  arr[i][j]=s.nextInt();
    	  }
    	  
//    	  System.out.println();
    	  
      }
      
      // print
      
       // loop for Row
      
       for(int i=0; i<3;i++) {
    	   
    	   // loop for col
    	   
    	   for(int j=0; j<4;j++) {
    		   
    		   System.out.print(arr[i][j]+" ");
    	   }
    	   System.out.println();
       }
      
      
      
      
      
      
      
      
      
	}

}

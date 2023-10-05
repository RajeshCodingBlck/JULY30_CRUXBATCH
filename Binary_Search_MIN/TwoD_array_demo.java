package Binary_Search_MIN;

import java.util.Scanner;

public class TwoD_array_demo {
   
	public static void Display(int [] [] arr) {
		
		   
		// No of Rows
//		 int rows= arr.length;
//		 
//		 int cols= arr[0].length;
//		 
//		 System.out.println(" No of Rows " + rows);
//		 System.out.println("No of Cols "+ cols);
		
		
		  for(int i=0; i<arr.length;i++) {
			  
			  for(int j=0; j<arr[0].length;j++) {
				  
				  System.out.print(arr[i][j]+" ");
			  }
			  
			  System.out.println();
		  }
		 
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner s= new Scanner(System.in);
      // How to Take Input in 2D Array
		
		
		
		
		
		int n= s.nextInt(); // Number of Rows
		
		int m= s.nextInt(); // Number of Cols
		
		
		int [][] arr= new int[n][m];
		
		for(int i=0; i<n;i++) { // loop for Row
			
		   for(int j= 0; j<m;j++) { // loop for Cols
			   
			   arr[i][j]=s.nextInt();
		   }
		}
		
		Display(arr);
		
		
		
		
       
       
       
	}

}

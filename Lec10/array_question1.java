package Lec10;
import java.util.*;
public class array_question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	   Scanner s= new Scanner(System.in);
	   
	   int n= s.nextInt();
	   
	   int [] arr= new int[n];
	   
	   for(int i=0; i<n;i++) {
		   
		   arr[i]= (i+1)*100;
	   }
	   
	   for(int i=0; i<n;i++) {
		   System.out.print(arr[i]+" ");
	   }
	}

}

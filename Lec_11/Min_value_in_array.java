package Lec_11;
import java.util.*;
public class Min_value_in_array {
   
	public static int min(int [] arr) {
		
		int min_so_far=arr[0];
		
		for(int i=1; i<arr.length;i++) {
			
			min_so_far= Math.min(min_so_far, arr[i]);
			
		}
		
		return min_so_far;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner s= new Scanner(System.in);
		
		int size=s.nextInt();
		
		int [] arr= new int [size];
		
		for(int i=0; i<arr.length;i++) {
			
			arr[i]=s.nextInt();
		}
		
		int ans= min(arr);
		
		System.out.println(ans);
	}

}

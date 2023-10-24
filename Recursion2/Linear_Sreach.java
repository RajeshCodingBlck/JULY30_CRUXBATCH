package Recursion2;

public class Linear_Sreach {
   
	public static boolean Linear_search(int [] arr,
			int i, int target) {
		  
		if(i==arr.length) {
			
			return false;
		}
		 
		if(arr[i]==target) {
			return true;
		}
		
		 return Linear_search(arr, i+1, target);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int [] arr= {1,4,3,2,7,9};
		
		System.out.println(Linear_search(arr, 0, 14));
	}

}

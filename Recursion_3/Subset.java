package Recursion_3;


public class Subset {

	public static void Print(int [] arr, int i, int k, 
			     int sum,  String ans) {
		
        if(sum>k) {
			
			return;
		}
		if(i==arr.length) {
			
			System.out.println(ans);
			
			return;
		}
		
		
	
		Print(arr, i+1, k, sum+arr[i], ans+arr[i]+" , " );
		Print(arr, i+1,k, sum+0, ans);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr= {10,3,1,2,4};
        
        Print(arr, 0, 10,0, "");
	}

}

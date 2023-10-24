package Recursion_1;

public class Print_inDecreasing_order {
   
	public static void PrintInDecreasing(int n) {
		
		
		 if(n==0) {
			 return;
		 }
		System.out.println(n);
		PrintInDecreasing(n-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintInDecreasing(5);
	}

}

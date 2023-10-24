package Recursion_1;

public class Print_in_increasing_order {
   
	public static void Printin_increasing(int n) {
		
		
		 if(n==0) {
			 return;
		 }
		 Printin_increasing(n-1);
		System.out.println(n);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printin_increasing(5);
	}

}

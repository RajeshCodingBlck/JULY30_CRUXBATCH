package Recursion_3;

public class bit_combination {

	public static void bit_comb(int n, String ans) {
		
		if(n==0) {
			
			System.out.println(ans);
			return;
		}
		
		bit_comb(n-1,ans+"0");
		bit_comb(n-1, ans+"1");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		bit_comb(3,"");
		
	}

}

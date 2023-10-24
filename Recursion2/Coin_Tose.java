package Recursion2;

public class Coin_Tose {
   
	public static void Print_coin_tos(int n, String ans) {
		
		 if(n==0) {
			 System.out.println(ans);
			 return;
		 }
		Print_coin_tos(n-1,ans+"H");
		Print_coin_tos(n-1,ans+"T");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Print_coin_tos(3, "");
		
	}

}

package Recursion2;

public class Subsequence {
    
	public static void Print_subsequence(String str, 
			String ans){
		
		  if(str.length()==0) {
			  
			  System.out.println(ans);
			  return;
		  }
		
		char ch= str.charAt(0);
		
		Print_subsequence(str.substring(1),ans+"");
		Print_subsequence(str.substring(1),ans+ch);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print_subsequence("abc", "");
	}

}

package twoD_aaray;

import java.util.Scanner;

public class Palidromic_String {
    
	public static boolean IsPalid(String str) {
		
		
		 String rev="";
		 
		 for(int i= str.length()-1; i>=0;i--) {
			 
			 rev += str.charAt(i);
		 }
		 
		 if(rev.equals(str)) {
			 
			 return true;
		 }else {
			 return false;
		 }
	}
	
	public static boolean Method2(String str) {
		
		
		int i=0;
		int j= str.length()-1;
		
		while(i<=j) {
			
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			
			i++;
			j--;
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		String str= s.next();
		
		System.out.println(IsPalid(str));
		
		
		
		
		

	}

}

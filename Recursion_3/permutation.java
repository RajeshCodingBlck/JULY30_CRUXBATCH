package Recursion_3;

public class permutation {
	
	
  
	public static void print_permutation(String str, String ans) {
		
		
		if(str.length()==0) {
			
			System.out.println(ans);
			return ;
		}
		
		for(int i=0; i<str.length();i++) {
			
			char ch= str.charAt(i);
			String left= str.substring(0,i);
			String right= str.substring(i+1);
			
			String remain= left+right;
			
			boolean check=true;
			
			for(int j=i+1; j<str.length();j++) {
				
				if(str.charAt(j)==ch) {
					check=false;
					break;
				}
			}
			
			
			if(check==true) {
				print_permutation(remain, ans+ch);
			}
		}
	   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		print_permutation("abca","");
	    
	}

}

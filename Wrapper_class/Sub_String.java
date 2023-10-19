package Wrapper_class;

public class Sub_String {
   
	public static int Longest_good_Substring(String str) {
		
		int count=0;
		
		int ans=0;
		
		for(int i=0; i<str.length();i++) {
			 if(str.charAt(i)=='a'||
			    str.charAt(i)=='e'||
			    str.charAt(i)=='i'||
			    str.charAt(i)=='o'||
			    str.charAt(i)=='u') {
				 
				 count++;
			 }else {
				 ans= Math.max(ans,  count);
				 count=0;
			 }
		}
		
		if(count>0) {
			ans= Math.max(ans, count);
		}
		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String str="abaaaaaa";
		
		System.out.println(Longest_good_Substring(str));
		
		
	}

}

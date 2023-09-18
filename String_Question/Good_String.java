package String_Question;

public class Good_String {
   
	public static int GoodString(String str) {
		
//		String good="";
		
		int ans=0;
		
		int count=0;
		
		for(int i=0; i<str.length();i++) {
			
			if(str.charAt(i)=='a'||
			   str.charAt(i)=='e'||
			   str.charAt(i)=='i'||
			   str.charAt(i)=='o'||
			   str.charAt(i)=='u') {
				
//				good+=str.charAt(i);
				count++;
			}else {
				
			ans= Math.max(ans, count);
//			  good="";
			  count=0;
			  
			}
		}
		
		ans= Math.max(ans, count);
		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str= "aaaaaa";
      
      System.out.println(GoodString(str));
	}

}

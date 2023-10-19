package String_questions;

public class Left_most_repeated_character {
    
	public static int leftMost_repeated(String str) {
		
		int [] fre= new int[256];
		
		int ans=-1;
		
		for(int i=str.length()-1; i>=0;i--) {
			
			int index= str.charAt(i);
			
			fre[index]++;
			
			 if(fre[index]>=2) {
				 ans=i;
			 }
		}
//		
//		 for(int i=0;i<str.length();i++) {
//			 
//			  int index= str.charAt(i);
//			  
//			  if(fre[index]>=2) {
//				  return i;
//			  }
//		 }
		 
		 return ans;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="fiabab";
      
      System.out.println(leftMost_repeated(str)); 
	}

}

package String_questions;

public class Anagram {
    
	public static boolean Anagram(String str1,
			                       String str2) {
		
		
		int []fre1 = new int[256];
		int [] fre2= new int[256];
		
		for(int i=0;i<str1.length();i++) {
			
			int index= str1.charAt(i);
			
			fre1[index]++;
		}
		
		for(int i=0; i<str2.length();i++) {
			
			int index= str2.charAt(i);
			
			fre2[index]++;
		}
		
		for(int i=0;i<256;i++) {
			
			if(fre1[i]!=fre2[i]) {
				return false;
			}
		}
		 return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str1= "aaaaa";
        String str2= "abbbb";
        
        System.out.println(Anagram(str1, str2));
        
        
	}

}

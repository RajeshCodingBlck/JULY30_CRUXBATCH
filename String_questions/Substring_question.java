package String_questions;

public class Substring_question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String str="abcd";
		
		for(int s=0; s<str.length();s++) {
			
			for(int e=s; e<str.length();e++) {
				
				System.out.print("( "+ s+" "+e+" )  -> ");
				
				System.out.println(str.substring(s,e+1));
			}
		}
		
		
	}

}

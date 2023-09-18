package String_Question;

public class Palidromic_String {
   
	public static boolean IsPalid(String str) {
		
		String reverse_str="";
		
		for(int i= str.length()-1;i>=0;i--) {
			
			reverse_str += str.charAt(i);
			
		}
		
		 if(reverse_str.equals(str)) {
			 
			 return true;
		 }else {
			 
			 return false;
		 }
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str= "Nitin";
       
       System.out.println(IsPalid(str));
       
       
       
       
	}

}

package twoD_aaray;

public class My_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String str= new String("hello"); // new Keyword
		
		String str2= "hello";// String literals
		
		
		 if(str.equals(str2)) {
			 System.out.println("String is Same");
		 }else {
			 System.out.println("String is not  Same");
		 }
		 
		 String str3= "Bye";
		 String str4= "Bye";
		 
		 if(str3 == str4) {
			 System.out.println("String is Same");
		 }else {
			 System.out.println("String is not  Same");
		 }
		 
		  str3= "Hello"+ str3;
		  
		  System.out.println(str3);
		  System.out.println(str4);
		  
		  // Methods
		  
		  System.out.println(str2.length());
		  
//		  System.out.println(str2.charAt(5));
		  
//		  System.out.println(str2.substring(6,5));
		  
		  System.out.println(4);
		  
		  String str7="afgg";
		  
		  String str8= "afgg";
		  
		  System.out.println(str7.compareTo(str8));
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		 
		 
	}

}

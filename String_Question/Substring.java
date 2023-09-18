package String_Question;

import java.util.Scanner;

public class Substring {
	
public static void display(String str, int s, int e) {
	
	
	for(int i=s; i<=e;i++) {
		
		System.out.print(str.charAt(i));
	}
	System.out.println();
}


  public static void printAllSubstring(String str) {
	  
	  
	  for(int s=0; s<str.length();s++) {
		  
		  for(int e= s;e<str.length();e++ ) {
			  
			   display(str, s, e);
			   
		  }
	  }
  }
   public static String getString() {
	   
	  
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="abcd";
         
         Scanner s= new Scanner(System.in);
         
//         printAllSubstring(str);
         
         String str1= s.next(); // User Input
         
         System.out.println(str1);
         
         
	}

}

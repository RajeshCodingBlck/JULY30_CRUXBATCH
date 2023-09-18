package String_Question;

public class String_Palidrom_method2 {
   
	public static boolean Isplaid(String str) {
		
		int s=0;
        int e= str.length()-1;
        
        while(s<=e) {
       	 
       	 if(str.charAt(s)== str.charAt(e)) {
       		 s++;
       		 e--;
       	 }else {
       		 
       		 return false;
       	 }
        }
        
        return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="abfa";
         
         System.out.println(Isplaid(str));
         
	}

}

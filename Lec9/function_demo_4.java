package Lec9;



public class function_demo_4 {
   public static int countDigit(int n) {
	   
	  
	   int count=0;
	   
	   while(n>0) {
		   n=n/10;
		   count++;
	   }
	   
	   return count;
	  
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int ans= countDigit(1234); 
	   System.out.println(ans);
	}

}

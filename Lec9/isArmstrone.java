package Lec9;

public class isArmstrone {
  
	public static int CountDigit(int n) {
		
		int count=0;
		
		while(n>0) {
			
			n=n/10;
			count++;
		}
		
		return count;
	}
	
	public static int SumofDigitPower(int n) {
		
		 int NumberofDigit= CountDigit(n);
		 
		 int sum=0;
		 
		 while(n>0) {
			 
			 int ld= n%10;
			 
			 sum+= Math.pow(ld, NumberofDigit);
			 
			 n=n/10;
		 }
		 
		 return sum;
		 
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
       
	   int n=371;
	   
	   int sum= SumofDigitPower(n);
	   
	   if(sum==n) {
		   System.out.println(true);
	   }else {
		   System.out.println(false);
	   }
	}

}

package Recursion_3;

public class Tower_of_hanaoi {
   
	public static void Print_toh(int n, String rodA, 
			String rodB, String rodC) {
		 
		  if(n==0) {
			  return; 
		  }
		Print_toh(n-1,rodA, rodC  ,rodB);
		System.out.println("Move the "+ n+ " ring from "+ 
		   rodA+ " to rod "+ rodC);
		Print_toh(n-1,rodB,rodA   , rodC);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Print_toh(3, "A", "B", "C");
		
	}

}

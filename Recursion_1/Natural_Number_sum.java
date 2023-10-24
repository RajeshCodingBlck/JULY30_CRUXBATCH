package Recursion_1;

public class Natural_Number_sum {
    
	public static int Sum_of_natural(int n){
		
		 if(n==1) {
			 return 1;
		 }
		 int chhota_ans= Sum_of_natural(n-1);
		 
		  int mera_ans=  chhota_ans+n;
		  
		  return mera_ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		System.out.println(Sum_of_natural(5));
	}

}

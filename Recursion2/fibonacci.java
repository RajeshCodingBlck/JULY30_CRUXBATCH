package Recursion2;

public class fibonacci {
    
	public static int fibo(int n) {
		
		if(n==1) {
			return 1;
		}
		
		if(n==0) {
			return 0;
		}
		
	    int chhota_ans1= fibo(n-1);
	    int chhota_ans2= fibo(n-2);
	    
	    int bada_ans= chhota_ans1+ chhota_ans2;
	    
	    return bada_ans;
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	  System.out.println(fibo(6));
	}

}

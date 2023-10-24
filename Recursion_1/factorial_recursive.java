package Recursion_1;

public class factorial_recursive {
     
    public static int fact(int n) {
    	   
    	    if(n==1) { // +ve Base Case
    	    	
    	    	return 1;
    	    }
    	    
    	     if(n==0) {   // -ve Base Case
    	    	 return 1;
    	     }
    	
    	    int chhota_ans= fact(n-1);
    	    
    	    int bada_ans= n*chhota_ans;
    	    
    	     return bada_ans;
    	  
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	    int n=5;
	    
	    System.out.println(fact(n));
	    
	}

}

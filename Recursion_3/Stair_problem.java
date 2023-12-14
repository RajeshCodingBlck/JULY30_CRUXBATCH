package Recursion_3;

public class Stair_problem {
    
	public static void print_stair(int n, String ans, int curr_stair) {
		
		    if(n== curr_stair) { //+ve Base
		    	
		    	System.out.println(ans);
		    	return;
		    }
		    
		    if(curr_stair>n) {
		    	
		    	return;
		    }
		   
		    print_stair(n, ans+"1", curr_stair+1);
		    print_stair(n, ans+"2", curr_stair+2);
		    
		    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		print_stair(4,"", 0);
		
	}

}

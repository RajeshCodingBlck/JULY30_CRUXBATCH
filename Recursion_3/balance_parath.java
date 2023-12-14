package Recursion_3;

public class balance_parath {
    
	public static void print_balance_parath(int rem_open, 
			int rem_close, String ans) {
		
		if(rem_open==0 && rem_close==0) {
			System.out.println(ans);
			return;
		}
		
		if(rem_open<0 || rem_close<0) {
			return ;
		}
		
		if(rem_open>rem_close) {
			return ;
		}
		
		print_balance_parath(rem_open-1, rem_close, ans+"(");
		print_balance_parath(rem_open, rem_close-1, ans+")");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		print_balance_parath(3,3,"");
	}

}

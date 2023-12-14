package Recursion_3;

public class Rat_problem {
    
	public static void Print_path(int curr_r, int curr_c, int dr, int dc,
			                  String ans) {
		
		if(curr_r==dr && curr_c==dc) {
			
			System.out.println(ans);
			return;
		}
		
		if(curr_r>dr || curr_c>dc) {
			return ;
		}
		
		
		Print_path(curr_r, curr_c+1,dr, dc, ans+"R");
		Print_path(curr_r+1, curr_c,dr, dc, ans+"D");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Print_path(0, 0,4, 3, "");
	}

}

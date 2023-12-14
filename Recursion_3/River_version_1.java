package Recursion_3;

public class River_version_1 {
    
	public static void River(int n, String ans) {
		
		if(n==0) {
			System.out.println(ans);
			return;
		}
		if(n<0) {
			return;
		}
		River(n-1, ans+1);
		River(n-2, ans+2);
		River(n-3, ans+3);
		River(n-4, ans+4);
		River(n-5, ans+5);
		River(n-6, ans+6);
		
		for(int dic_value=1; dic_value<7;dic_value++) {
			
			River(n-dic_value, ans+dic_value);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int n=5;
		River(n-1, "");
		
	}

}

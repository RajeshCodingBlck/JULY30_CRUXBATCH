package Lec15;

public class Equation_max_x {
    
	public static int Equation_Solver(int n) {
		
		int low=0;
		int high=n;
		int ans=-1;
		while(low<=high) {
			
			int mid=(low+high)/2;
			
			if(mid*mid<=n) {
				ans=mid;
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println(Equation_Solver(10000));
		
		int val= (int)Math.sqrt(10000);
		System.out.println(val);
	}

}

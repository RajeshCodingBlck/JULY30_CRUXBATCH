package Lec15;

public class Equation_BinarySearch {
   
	public static int Equation(int n) {
		int low=0;
		int high=n;
		int ans=0;
		while(low<=high) {
			
			
			int mid= (low+high)/2;
			
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
       
		
		System.out.println(Equation(200));
	}

}

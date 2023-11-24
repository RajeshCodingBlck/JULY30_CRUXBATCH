package Time_complexity;

public class Demo {

	public static int A1(int n) {
		
		
		int sum=0;
		
		for(int i=1; i<=n;i++) {
			
			sum+=i;
		}
		
		return sum;
	}
	
	public static int A2(int n) {
		
		
		int ans= (n*(n+1))/2;
		
		
		return ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		long start= System.nanoTime();
		
		System.out.println(A1(10));
		
		long end= System.nanoTime();
		
		System.out.println(end-start);
		
		
		int n=10000;
		
		for(int i=n; i>=1;) {
			
			System.out.println("Time Complexity Find karo");
			
			 i=i/2;
			 i=i/3;
					 
		}
		
		
		for(int i=1;i<=n;i=i+2) {
			
			// Syso
		}
		
		
		
		
		
		
	
		
		
		
	}

}

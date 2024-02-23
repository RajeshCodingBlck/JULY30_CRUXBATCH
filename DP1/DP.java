package DP1;

public class DP {
    
	static int count=0;
	public static int fibo(int n) {
		
		if(n==0 || n==1) {
			return n;
		}
		count++;
		System.out.println("n is "+ n+ " count is "+ count);
		int chhota_ans1=fibo(n-1);
		int chhota_ans2=fibo(n-2);
		
		int mera_ans= chhota_ans1+chhota_ans2;
		
		return mera_ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(fibo(11));
		
	}

}

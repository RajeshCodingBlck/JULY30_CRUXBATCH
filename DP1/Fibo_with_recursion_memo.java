package DP1;

import java.util.HashMap;

public class Fibo_with_recursion_memo {

	static int count=0;
//	public static int fibo(int n, HashMap<Integer, Integer> brain) {
//		
//		if(n==0 || n==1) {
//			
//			return n;
//		}	
//		if(brain.containsKey(n)==true) {
//			return brain.get(n);
//		}
////		count++;
////		System.out.println("N is "+ n+ "count is "+count);
//		
//		int chhota_ans1= fibo(n-1, brain);
//		int chhota_ans2=fibo(n-2, brain);
//		int mera_ans=chhota_ans1+chhota_ans2;
//		brain.put(n, mera_ans);
//		return mera_ans;
//		
//		
//	}
	public static int fibo(int n, int [] brain) {
		
		if(n==0 || n==1) {
			return n;
		}
		if(brain[n]!=0) {
			
			return brain[n];
		}
		int chhota_ans1= fibo(n-1, brain);
		int chhota_ans2=fibo(n-2, brain);
		return brain[n]=chhota_ans1+chhota_ans2;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		//HashMap<Integer, Integer> brain= new HashMap();
		int n=11;
		int [] brain= new int [n+1];
		System.out.println(fibo(n, brain));
	}

}

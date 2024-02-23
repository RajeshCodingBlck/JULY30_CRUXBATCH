package DP1;

public class Climbing_stair {

	public static int climb(int n, int [] brain) {
		
		if(n==0) {
			 return 1;
		}	
		if(n<0) {
			
			return 0;
		}
		
		if(brain[n] !=0) {
			return brain[n];
		}
		System.out.println("N is "+n);
		int chhota_ans1= climb(n-1, brain);
		int chhota_ans2=climb(n-2, brain);
		int mera_ans=chhota_ans1+chhota_ans2;
		brain[n]=mera_ans;
		return mera_ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] brain= new int[12];
		System.out.println(climb(11, brain));
	}

}

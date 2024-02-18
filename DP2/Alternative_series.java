package DP2;

public class Alternative_series {
    
	public static int Alter(int [] arr) {
		
		int [] dp= new int[arr.length];
//		 dp[i] = Longest Subarray of
//		Alternative Series ending at index i/
		dp[0]=1;
		int ans=Integer.MIN_VALUE;
		for(int i=1; i<arr.length;i++) {
			 
			if(arr[i]*arr[i-1]<0) {
				dp[i]=1+dp[i-1];
			}else {
				dp[i]=1;
			}
			
			ans= Math.max(ans, dp[i]);
		}
		return ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1, -1, 2, 3, -4, 5, -6};
       System.out.print(Alter(arr));
       
	}

}

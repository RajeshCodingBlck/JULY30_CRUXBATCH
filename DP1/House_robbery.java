package DP1;

import java.util.Arrays;

public class House_robbery {
   
//	https://leetcode.com/submissions/detail/1172289385/
//	class Solution {
//	    public int helper(int []nums, int i, int [] brain){
//	        
//	    if(i>=nums.length){
//	        
//	        return 0;
//	    }
//	        
//	    if(brain[i] !=-1){
//	        
//	        return brain[i];
//	    }
//	     // Roberry karenge
//	    
//	    int chhota_ans1= nums[i]+helper(nums, i+2, brain);
//	    
//	    // Roberry Nahi Karenge
//	    int chhota_ans2= 0+ helper(nums,i+1, brain);
//	        
//	    int mera_ans= Math.max(chhota_ans1, chhota_ans2);
//	    
//	    return brain[i]=mera_ans;
//	        
//	    }
//	    public int rob(int[] nums) {
//	        
//	       int [] brain= new int[nums.length];
//
//	        // for(int i=0; i<nums.length;i++){
//	        //     brain[i]=-1;
//	        // }
//	        
//	        Arrays.fill(brain,-1);
//	        return helper(nums,0, brain);
//	        
//	    }
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int n=11;
		int [] dp= new int [n+1];
		
		// dp[i]= ith fibo ans
		
		dp[0]=0;
		dp[1]=1;
		
		for(int i=2;i<dp.length;i++) {
			
			dp[i]=dp[i-1]+dp[i-2];
		}
		
		System.out.println(dp[n]);
		
	}

}

class Solution {
    public int longestCommonSubsequence(String str1, String str2) {
        
        int n= str1.length();
        int m=str2.length();
        
        int [][] dp= new int[n+1][m+1];
        
        for(int i=0; i<=n;i++){
            
            for(int j=0; j<=m;j++){
                
                if(i==0 || j==0){
                    dp[i][j]=0;
                }else{
                    
                    if(str1.charAt(i-1 ) == str2.charAt(j-1)){                     
                        dp[i][j]= 1+dp[i-1][j-1];
                    }else{
                        dp[i][j]= Math.max(dp[i][j-1], dp[i-1][j]);
                    }
                }
            }
        }
        
        return dp[n][m];
        
        
}
}

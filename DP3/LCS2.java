class Solution {
    public int longestCommonSubsequence(String str1, String str2) {
        
        int n=str1.length();
        int m= str2.length();
        int [][] dp= new int [n][m];
        
        for(int i=0; i<n;i++){
            
            for(int j=0; j<m;j++){
                
                if(i==0 && j==0){
                    
                    if(str1.charAt(i)==str2.charAt(j)){
                        dp[i][j]=1;
                    }else{
                        dp[i][j]=0;
                    }
                }else if(i==0){
                    
                     if(str1.charAt(i)==str2.charAt(j)){
                        dp[i][j]=1;
                    }else{
                        dp[i][j]=dp[i][j-1];
                    }
                    
                }else if(j==0){
                    
                     if(str1.charAt(i)==str2.charAt(j)){
                        dp[i][j]=1;
                    }else{
                        dp[i][j]=dp[i-1][j];
                    }
                    
                }else{
                    
                     if(str1.charAt(i)==str2.charAt(j)){
                        dp[i][j]=1+ dp[i-1][j-1];
                    }else{
                        dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
                    }
                }
            }
        }
        
        return dp[n-1][m-1];
    }
}

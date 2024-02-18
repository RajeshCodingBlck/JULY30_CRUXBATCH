class Solution {
    public int helper(int i, int j, String str1, String str2){
        
        if(i==str1.length()){
            return str2.length()-j;
        }
        
        if(j==str2.length()){
            
            return str1.length()-i;
        }
        
        if(str1.charAt(i)==str2.charAt(j)){
            
            return helper(i+1, j+1, str1, str2);
        }else{
            
              int ans1=1+helper(i+1, j+1, str1, str2);
              int ans2=1+helper(i+1,j, str1, str2);
              int ans3=1+helper(i,j+1, str1, str2);
        
        return Math.min(ans1, Math.min(ans2,ans3));
        }
        
      
        
    }
    public int minDistance(String str1, String str2) {
        
       
      int n= str1.length();
      int m=str2.length();
      int [][] dp= new int[n+1][m+1];
        
      for(int i=0; i<=n;i++){  
          for(int j=0; j<=m;j++){
              
            if(i==0 && j==0){
              
                dp[i][j]=0;
                
           }else if(i==0){
                 
                 dp[i][j]=j;
                 
             }else if(j==0){
                 
                 dp[i][j]=i;
                 
             }else{
                 
                 if(str1.charAt(i-1) == str2.charAt(j-1)){
                     
                    dp[i][j]= dp[i-1][j-1]; 
                     
                 }else{
                     
            dp[i][j]=1+Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
                     
                 }
             }
          }
      }
       
        return dp[n][m];
    }
}

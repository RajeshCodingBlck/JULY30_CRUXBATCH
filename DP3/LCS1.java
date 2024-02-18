class Solution {
    public int helper(int i, int j, String str1, String str2, int [][] brain){
        
        if(i==str1.length() || j==str2.length()){
            
            return 0;
        }
        
        if(brain[i][j] !=-1){
            
            return brain[i][j];
        }
        
        if(str1.charAt(i)==str2.charAt(j)){
            
            int mera_ans= 1+ helper(i+1, j+1, str1, str2, brain);
            return brain[i][j]=mera_ans;
        }else{
            
            int chhota_ans1= helper(i, j+1, str1, str2, brain);
            int chhota_ans2=helper(i+1,j, str1, str2, brain);            
            return brain[i][j]= Math.max(chhota_ans1, chhota_ans2);
            
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        
        int n= text1.length();
        int m= text2.length();
        int [] [] brain= new int[n][m];
        
      for(int i=0; i<n;i++){
          for(int j=0; j<m;j++){
              brain[i][j]=-1;
          }
      }  
        
        return helper(0,0, text1, text2, brain);
        
    }
}

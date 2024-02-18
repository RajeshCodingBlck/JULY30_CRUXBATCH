class Solution {
    public int helper(String str1, String str2, int i, int j){
        
        if(i==str1.length()){
            
            return str2.length()-j;
        }
        
        if(j==str2.length()){
            return str1.length()-i;
        }
        
        if(str1.charAt(i)==str2.charAt(j)){
            
            return helper(str1, str2, i+1,j+1);
        }else{
            
           int chhota_ans1= 1+ helper(str1, str2, i+1,j);
            int chhota_ans2= 1+ helper(str1, str2, i,j+1);
            
            int mera_ans=Math.min(chhota_ans1, chhota_ans2);
            return mera_ans;
        }
    }
    public int minDistance(String word1, String word2) {
        
        return helper(word1, word2, 0,0);
        
    }
}

class Solution {
    public int helper(int [] cost, int i, int [] brain){
        
        if(i>= cost.length){ 
            return 0;
        }
       
        if(brain[i] !=-1){
            return brain[i];
        }
      int chhota_ans1= cost[i]+ helper(cost, i+1, brain); // 1 length jump
      int chhota_ans2= cost[i]+helper(cost, i+2, brain);  // 2 length jump 
      int mera_ans= Math.min(chhota_ans1, chhota_ans2); 
        return  brain[i]=mera_ans;
    }
    public int minCostClimbingStairs(int[] cost) {
      
     int [] brain= new int [cost.length+1];
     Arrays.fill(brain, -1);
     int ans1= helper(cost,0, brain);
     int ans2= helper(cost,1, brain);
    
      return Math.min(ans1, ans2);
    }
}

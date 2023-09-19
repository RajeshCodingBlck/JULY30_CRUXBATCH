package Lec13;
// Leetcode code https://leetcode.com/submissions/detail/1051740442/ (Rajesh  Submission Id)
class Solution {
    public static void reverse(int [] arr, int s, int e){
        
        while(s<=e){
            
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public void rotate(int[] nums, int k) {
        
        
       k= k%nums.length;
    
      reverse(nums, 0, nums.length-1);
      reverse(nums, 0, k-1);
      reverse(nums, k, nums.length-1);
        
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int diameter=0;
    public int height(TreeNode root){
        
        if(root==null){
            return -1;
        }
        
        int left_height= height(root.left);
        int right_height= height(root.right);
        
        int curr_diameter= left_height+right_height+2;
        diameter= Math.max(curr_diameter, diameter);
        
        return Math.max(left_height, right_height)+1;
        
    }
    public int diameterOfBinaryTree(TreeNode root) {
        
        diameter=0;
        height(root);
        return diameter;
    }
}

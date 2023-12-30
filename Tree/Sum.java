class BinaryTree
{
    static int sumBT(Node root){
        //Code
        
        if(root==null){
            
            return 0;
        }
      
      int left_sum= sumBT(root.left);
      int right_sum=sumBT(root.right);
      
      return left_sum+right_sum+ root.data;
      
    }
}

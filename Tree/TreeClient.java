package Tree;

public class TreeClient {

	// 12 13 NULL 17 NULL NULL 14 15 NULL NULL NULL 
	
	public static void Preorder(TreeNode root) {
		
		if(root==null) {
			
			return ;
		}
		
		System.out.print(root.data+ " ");
		Preorder(root.left);
		Preorder(root.right);
		
	}
	
  public static void Inorder(TreeNode root) {
		
		if(root==null) {
			
			return ;
		}
		
		Inorder(root.left);
		System.out.print(root.data+ " ");
		Inorder(root.right);
		
	}
    public static void PostOrder(TreeNode root) {
		
		if(root==null) {
			
			return ;
		}
		
		PostOrder(root.left);
		PostOrder(root.right);
		System.out.print(root.data+ " ");
		
		
	}
    public static boolean search(TreeNode root, int val) {
    	
    	
    	 if(root==null) {
    		 
    		 return false;
    	 }
    	
    	
    	 boolean left_ans= search(root.left, val);
    	 boolean right_ans=search(root.right, val);
    	 
    	 if(root.data==val || left_ans==true || right_ans==true ) {
    		 
    		 return true;
    	 }
    	 
    	 return false;
    	 
    }
    
    public static myPair findMaxMin(TreeNode root) {
    	
    	 if(root==null) {
    		 
    		  return new myPair();
    	 }
    	
    	myPair left= findMaxMin(root.left);
    	myPair right=findMaxMin(root.right);
    	
    	myPair mera_ans= new myPair();
    	
    	mera_ans.max= Math.max(root.data, 
    			               Math.max(left.max, right.max));
    	
    	mera_ans.min=Math.min(root.data, 
	               Math.min(left.min, right.min));
    	
    	return mera_ans;
    	
    	
    	
    }
    
    public static int heightEdge(TreeNode root) {
    	
    	
    	// Math Trick for Not handling the leaf Node.
    	
//    	  if(root==null) {
//    		  
//    		  return -1;
//    	  }
    	
    	 if(root==null) {
    		 
    		 return 0;
    	 }
    	
    	 if(root.left==null && root.right==null) {
    		 
    		 return 0;
    	 }
    	
    	int left_height= heightEdge(root.left);
    	int right_height= heightEdge(root.right);
    	
    	int mera_height= Math.max(left_height, right_height)+1;
    	
    	return mera_height;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Tree mytree= new Tree();
        
        
//        Preorder(mytree.root);
//        System.out.println();
//        Inorder(mytree.root);
//        System.out.println();
//        PostOrder(mytree.root);
        
          System.out.println(search(mytree.root, 20));
          
          myPair overall_ans= findMaxMin(mytree.root);
          
          System.out.println(overall_ans.max+ " "+ overall_ans.min);
          
          
          System.out.println(heightEdge(mytree.root));
          
          
        
        
	  }

}


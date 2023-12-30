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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Tree mytree= new Tree();
        
        
        Preorder(mytree.root);
        System.out.println();
        Inorder(mytree.root);
        System.out.println();
        PostOrder(mytree.root);
        
        
	  }

}


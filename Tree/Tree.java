package Tree;

import java.util.Scanner;

public class Tree {
     
	  public TreeNode root;
	  
	  Scanner s= new Scanner(System.in);
	  public Tree(){
		   
		root= buildTree();
	  }
	private TreeNode buildTree() {
		
		 System.out.println("Enter the data");
		 
		 String str= s.next();
		 
		 if(str.equals("NULL")) {
			 
			 return null;
		 }
		 
		 int data= Integer.parseInt(str);
		 
		 TreeNode new_node =new TreeNode(data);
		 
		 System.out.println("Enter the left child  of"+ data);
		 
		 new_node.left=buildTree();
		 
        System.out.println("Enter the Right child  of"+ data);
		 
		 new_node.right=buildTree();
		 
		 
		 return new_node;
	}
}

package Tree_question;
import java.util.*;

import  Tree.*;
public class Level_order_traversal {
    
   public static void level_order(TreeNode root) {
		
	  LinkedList<TreeNode> q= new LinkedList();
	  
	  q.addLast(root);
	  
	  while(q.size()>0) {
		  // remove the First Node of Queue
		  TreeNode curr_node= q.removeFirst();
		  // Work (Print the Node value)
		  System.out.print(curr_node.data+" ");
		  // Add the Childrens
		  if(curr_node.left !=null) {
			  q.addLast(curr_node.left);
		  }  
		  if(curr_node.right !=null) {
			  q.addLast(curr_node.right);
		  }
		  
	  }
	  
	}
  // 12 13 NULL 17 NULL NULL 14 15 NULL NULL NULL 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Tree mytree= new Tree();
       level_order(mytree.root);
       
	}

}

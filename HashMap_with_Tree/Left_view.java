package HashMap_with_Tree;
import java.util.HashMap;
import Tree.*;
public class Left_view {
   
//	 12 13 NULL 17 NULL NULL 14 15 NULL NULL NULL 
	public static void Left_view(TreeNode root, HashMap<Integer, Integer> m, int level) {
		
		
		if(root==null) {
			return;
		}
		if(m.containsKey(level)==false) {
			
			m.put(level, root.data);
		}
		
		Left_view(root.left, m, level+1);
		Left_view(root.right, m, level+1);	
	}
	
public static void Top_view(TreeNode root, HashMap<Integer, Integer> m, int Hor_dis) {
			
		if(root==null) {
			return;
		}
		if(m.containsKey(Hor_dis)==false) {
			
			m.put(Hor_dis, root.data);
		}
		
		Top_view(root.left, m, Hor_dis-1);
		Top_view(root.right, m, Hor_dis+1);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Tree mytree=new Tree();
        
        HashMap<Integer, Integer> m= new HashMap();
        Left_view(mytree.root, m, 0);
        
        for(Integer key : m.keySet()) {
        	
        	System.out.println(key+" -> "+ m.get(key));
        	
        }
        
	}

}

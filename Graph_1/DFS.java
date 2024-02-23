package Graph_1;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS {

	public static void dfs(ArrayList<Integer> [] adj, int curr, int [] visited) {
		
		  visited[curr]=1;
		  System.out.println(curr);
		  
		  
//		  for(int i=0; i<adj[curr].size();i++) {
//			  
//			   dfs(adj, adj[curr].get(i));
//		  }
		  
		  for( int nb :  adj[curr]) {
			  
			    if(visited[nb]==0) {
			    	dfs(adj, nb, visited);
			    }
		  }
		  
		  
	}
	// 5 0 3 1 5
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	    ArrayList<Integer> [] adj= new ArrayList[6];
	    for(int i=0; i<adj.length;i++) {
	    	adj[i]=new ArrayList();
	    }
	    Scanner s= new Scanner(System.in);
	    
	    for(int i=0; i<6;i++) {
	    	
	    	int u= s.nextInt();
	    	int v= s.nextInt();
	    	
	    	adj[u].add(v);
	    	adj[v].add(u);
	    }
	    int [] visited= new int[6];
	     
	    for(int i=0; i<6;i++) {
	    	
	    	if(visited[i]==0) {
	    		dfs(adj, i, visited);
	    	}
	    }
	    
//		int [] arr= {1,2,3,4,5};
//		
//		for(int str : arr ) {
//			
//			System.out.print(str);
//		}
	    
	}

}

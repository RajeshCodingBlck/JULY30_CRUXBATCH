package Graph_1;

import java.util.ArrayList;

public class Graph3 {

	 ArrayList<Integer> [] adj;
	 
	 Graph3(int n){
		 
		 adj= new ArrayList[n];
		 
		 for(int i=0; i<n;i++) {
			 adj[i]=new ArrayList();
			// System.out.println(adj[i]);
		 }
		 
	 }
	 
	  void addEdges(int u, int v) {	
			
			 adj[u].add(v);
			 adj[v].add(u);
		}
		
		void display() {	
			
			
			 for(int i=0; i<adj.length;i++) {
				 System.out.print(i+ " -> ");
				
				  for(int nb : adj[i]) {
					  System.out.print(nb+ " , ");
				  }
				 System.out.println();
			 }
		}
		
		
	 
	 
}

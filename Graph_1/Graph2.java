package Graph_1;

public class Graph2 {
   
	int [][] adj;
	
	Graph2(int n){		
		adj= new int[n][n];
	}
	
	void addEdges(int u, int v) {	
		adj[u][v]=1;
		adj[v][u]=1;
				
	}
	
	void display() {	
		for(int i=0; i<adj.length;i++) {
			
			for(int j=0; j<adj.length;j++) {
				
				System.out.print(adj[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
}

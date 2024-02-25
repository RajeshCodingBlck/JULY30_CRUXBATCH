class Pair{
    
    int vertex;
    int weight;
    
    Pair(int vertex, int weight){
        
        this.vertex=vertex;
        this.weight=weight;
    }
    
}
class cmp implements Comparator<Pair>{
    
    public int compare(Pair p1, Pair p2){
        
        if(p1.weight >p2.weight){
            return 1;
        }else{
            return -1;
        }
    }
}
class Solution{
	static int spanningTree(int V, int E, int edges[][]){
	    // Code Here. 
	    
	    
	    ArrayList<Pair> [] adj= new ArrayList[V];
	    
	    for(int i=0; i<V;i++){
	        
	        adj[i]= new ArrayList<Pair>();
	    }
	    
	    for(int i=0; i<E; i++){
	        
	        int u= edges[i][0];
	        int v= edges[i][1];
	        int w= edges[i][2];
	        adj[u].add(new Pair(v,w));
	        adj[v].add(new Pair(u,w));
	    }
	    
	    
	    PriorityQueue<Pair> pq= new PriorityQueue(new cmp());
	    
	    int [] visited= new int [V];
	    
	    pq.add(new Pair(0,0));
	    
	    int ans=0;
	    
	    while(pq.size()>0){
	        
	        
	        // remove
	        Pair p= pq.remove();
	        
	        
	        int curr_node= p.vertex;
	        int weight= p.weight;
	        
	        
	        if(visited[curr_node]==1){
	            continue;
	        }
	        visited[curr_node]=1;
	        
	        ans+= weight;
	        
	        for( Pair  nb :  adj[curr_node]){
	            
	            if(visited[nb.vertex] ==0){
	                pq.add(new Pair(nb.vertex, nb.weight));
	            }
	            
	        }
	    }
	    
	    return ans;
	    
	    
	}
}

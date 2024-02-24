class Pair{
    
    int vertex;
    int distance;
    
    Pair(int vertex, int distance){
        
        this.vertex=vertex;
        this.distance=distance;
    }
    
}
class cmp implements Comparator<Pair>{
    
    public int compare(Pair p1,Pair p2){
        
        if(p1.distance > p2.distance){
            
            return 1;
        }else{
            return -1;
        }
    }
}
class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
        
        int [] dist= new int[V];
        Arrays.fill(dist, (int)(1e9));
        
        PriorityQueue<Pair> pq= new PriorityQueue(new cmp());
        
        pq.add(new Pair(S,0));
        dist[S]=0;
        
        while(pq.size()>0){
            
            // remove
            Pair p= pq.remove();
            
            int curr_node= p.vertex;
            int distance= p.distance;
            
            
            for(ArrayList<Integer> nb : adj.get(curr_node)){
                
                // distance Relaxation 
                
                if(distance+ nb.get(1)< dist[nb.get(0)]){
                    dist[nb.get(0)]=distance+ nb.get(1);
                    
                    pq.add(new Pair(nb.get(0), dist[nb.get(0)]));
                }
                
            }
            
            
        }
        
        return dist;
        
        
        
    }
}

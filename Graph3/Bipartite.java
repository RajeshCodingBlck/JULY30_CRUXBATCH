class Solution
{
    public boolean ispossible(ArrayList<ArrayList<Integer>> adj, 
                              int src, int [] visited, int [] color){
                                  
                                  
        visited[src]=1;
        
        for(int nb : adj.get(src)){
            
            if(visited[nb]==0){
                
                if(color[src]==0){
                    color[nb]=1;
                }else{
                    color[nb]=0;
                }
                
             boolean chhota_ans= ispossible(adj, nb, visited, color);
             if(chhota_ans==false){
                 return false;
             }
            }else{
                
                if(color[nb]== color[src]){
                    
                    return false;
                }
            }
        }
              
             return true;                    
                                  
    
    
     }
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        
        int [] visited= new int [V];
        
        int [] color= new int [V];
        
        
        for(int i=0; i<V;i++){
            
            if(visited[i]==0){
                
                color[i]=0;
              boolean ans=  ispossible(adj, i, visited, color);
              if(ans==false){
                  return false;
              }
            }
        }
        
        return true;
        
    }
}

package Graph_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Shortest_path {

public static int bfs(ArrayList<Integer>[] adj, int src, int des, int [] visited) {
		
		LinkedList<Pair> q= new LinkedList();
		
		q.addLast(new Pair(src,0));
		visited[src]=1;
		
		
		while(q.size()>0) {
			
			// remove
			Pair rm= q.removeFirst();	
			int curr_node= rm.vertex;
			int distance= rm.distance;
			// work
			if(curr_node==des) {
				return distance;
			}
			//  add the neighbour	
			for(int nb : adj[curr_node]) {
				
				if(visited[nb]==0) {
					visited[nb]=1;
					q.add(new Pair(nb,distance+1));
				}
			}	
		}
		
		return  Integer.MAX_VALUE;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> [] arr= new ArrayList [10];
	       Scanner s= new Scanner(System.in);
	       
	      for(int i=0; i<arr.length;i++) {
	    	  arr[i]=new ArrayList();
	      }
	      int m= s.nextInt();
	      for(int i=0; i<m;i++) {
	    	  
	    	  int u= s.nextInt();
	    	  int v= s.nextInt();
	    	  arr[u].add(v);
	    	  arr[v].add(u);
	      }
	      
	      int [] visited= new int[10];
	     int ans= bfs(arr, 1, 3,visited);
	     System.out.println(ans);
	     
	      
	}

}

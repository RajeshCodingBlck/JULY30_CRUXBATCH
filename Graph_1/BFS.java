package Graph_1;

import java.util.*;
import java.util.Scanner;

public class BFS {

	public static void bfs(ArrayList<Integer>[] adj, int src, int [] visited) {
		
		LinkedList<Integer> q= new LinkedList();
		
		q.addLast(src);
		visited[src]=1;
		
		
		while(q.size()>0) {
			
			// remove
			int curr_node= q.removeFirst();
			
			// work
			System.out.println(curr_node);
			
			//  add the neighbour
			
			for(int nb : adj[curr_node]) {
				
				if(visited[nb]==0) {
					visited[nb]=1;
					q.add(nb);
				}
			}	
		}
		
		
		
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
      int count=0;
      for(int i=1; i<10;i++) {
    	  
    	  if(visited[i]==0) {
    		  count++;
    		  bfs(arr, i,visited);
    	  }
      }
      
      System.out.println(" No of component is "+ count);
      
      
	}
	
//	7
//	1 2
//	2 3
//	3 4
//	3 6
//	5 6
//	5 9
//	7 8

}

package Graph_1;

import java.util.Scanner;

public class Graph {
    
	int [][] edgesList;
	Scanner s= new Scanner(System.in);
//	 Assume n is 5 Node values is from Range [0,4]
//	  m stands for no of Edges
	Graph(int m){
		
		edgesList= new int[m][2];
		
	    for(int i=0; i<m;i++) {
	    	
	    	int u= s.nextInt();
	    	int v= s.nextInt();
	    	
	    	edgesList[i][0]=u;
	    	edgesList[i][1]=v;
	    	
	    }
	    
	    
	}
	
	void display() {
		
		for(int i=0; i<edgesList.length;i++) {
			
			System.out.println(edgesList[i][0]+ " , "+ edgesList[i][1]);
		}
			
	}
	
	
	
	
	
}

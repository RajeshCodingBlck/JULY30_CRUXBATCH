package Graph_1;

import java.util.Scanner;

public class Graph3_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Graph3 g= new Graph3(6);
       
       Scanner s= new Scanner(System.in);  
       int m=s.nextInt();
       
       for(int i=0; i<m;i++) {
    	   
    	   int u= s.nextInt();
    	   int v= s.nextInt();
    	   g.addEdges(u, v);
       }
       
       g.display();
       
	}

}

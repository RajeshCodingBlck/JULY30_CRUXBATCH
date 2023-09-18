package Lec17;

public class _2D_array_question {
   public static void displayInWaveForm(int [][] arr) {
	   
	   // loop for Row
	    for(int i=0;i<arr.length;i++ ) {
	    	
	    	 if(i%2==0) {
	    		 
	    		 for(int j=0; j<arr[0].length;j++) {
	    			 
	    			 System.out.print(arr[i][j]+" ");
	    		 }
	    		 
	    	 }else {
	    		 
	    		 for(int j=arr[0].length-1;j>=0;j--) {
	    			 System.out.print(arr[i][j]+" ");
	    		 }
	    	 }
	    	 System.out.println();
	    	 
	    }
	    
   }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [][] arr= {  {1,2,3,4,5},
    		          {3, 4,4,6,7},
    		          {4,3,12,5,4},
    		          {2,3,1,2,3}
    		       };
     
      
      displayInWaveForm(arr);
     
     
	}

}

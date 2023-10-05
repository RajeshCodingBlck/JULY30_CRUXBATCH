package Binary_Search_MIN;

public class MIN_in_each_rows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] [] arr= {
    		  {1,2,3},
    		  {4,3,1},
    		  {5,3,1},
      };
      
      
      for(int i=0; i<arr.length;i++) {
    	  
    	  int min_val= Integer.MAX_VALUE;
    	  
    	  for(int j=0; j<arr[i].length;j++) {
    		  
    		  min_val= Math.min(min_val,arr[i][j]);
    		  
    	  }
    	  
    	  System.out.println(min_val);
      }
      
      
      
	}

}

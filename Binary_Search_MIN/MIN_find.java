package Binary_Search_MIN;

public class MIN_find {
    
	// Boolean Counter Part ....
	public static boolean Can_min(int [] arr, int min) {
		
		  for(int i=0; i<arr.length;i++) {
			  
			   if(min> arr[i]) {
				   return false;
			   }
		  }
		  
		  return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] arr= {14,10,-6,-20};
         
          int low=-1000;
          int high=Integer.MAX_VALUE;
          
          int ans=-1;
          while(low<=high) {
        	  
        	  int mid= (low+high)/2;
        	  
        	  if(Can_min(arr, mid)==false) {
        		  high=mid-1;
        	  }else {
        		  ans=mid;
        		  low=mid+1;
        	  }
          }
          
          System.out.println(ans);
	}

}

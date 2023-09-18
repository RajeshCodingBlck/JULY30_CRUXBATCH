package Lec16;

public class Binary_search01 {
    public static int Binary_search(int [] arr) {
    	
    	int low=0;
    	
    	int high=arr.length-1;
    	
    	int ans=-1;
    	while(low<=high) {
    		
    		int mid= (low+high)/2;
    		
    		if(arr[mid]==1) {
    			ans=mid;
    			low=mid+1;
    		}else {
    			high=mid-1;
    		}
    	}
    	
    	return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,1,1,1,1,0,0,0,0};
      
      
       System.out.println(Binary_search(arr));
       
     
	}

}

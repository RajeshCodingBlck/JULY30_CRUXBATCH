package Lec15;

public class Binary_Search {
    public static int Binary_Search(int [] arr, int target) {
    	
    	int low=0;
        int high=arr.length-1;
        
//        int target=11;
        
        while(low<=high) {
     	   
     	   int mid= (low+high)/2;
     	   
     	   if(arr[mid]==target) {
     		   
     		   return mid;
     	   }else if(arr[mid]>target) {
     		   high=mid-1;
     	   }else {
     		   low=mid+1;
     	   }
        }
        
        return -1;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,3,5,7,10,11,12};
       
       System.out.println(Binary_Search(arr,2));
       
	}

}

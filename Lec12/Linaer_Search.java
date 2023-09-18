package Lec12;

public class Linaer_Search {
   public static int Linear_Search(int [] arr, int target) {
	   
	   
	    for(int i=0; i<arr.length;i++) {
	    	
	    	  if(arr[i]==target) {
	    		  
	    		  return i;
	    	  }
	    }
	    
	    return -1;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {2,4,3,2,1,4};
       
       System.out.println(Linear_Search(arr,40));
	}

}

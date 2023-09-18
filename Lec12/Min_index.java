package Lec12;

public class Min_index {
   public static int find_MINIndex(int [] arr) {
	   
	   int min=arr[0];
	   int index=0;
	   
	   for(int i=1; i<arr.length;i++) {
		   
		    if(min>arr[i]) {
		    	min=arr[i];
		    	index=i;
		    }
	   }
	   
	   return index;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {12,3,4,12,20};
      
      System.out.println(find_MINIndex(arr));
      
	}

}

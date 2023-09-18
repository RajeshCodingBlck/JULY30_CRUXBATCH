package Lec13;

public class Selection_Sort {
	 public static int find_MINIndex(int [] arr, int s, int e) {
		   
		   int min=arr[s];
		   int index=s;
		   
		   for(int i=s; i<=e;i++) {
			   
			    if(min>arr[i]) {
			    	min=arr[i];
			    	index=i;
			    }
		   }
		   
		   return index;
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {6,2,1,4,2};
       
     
       
        for(int i=0;i<arr.length;i++) {
        	
        	int min_index= find_MINIndex(arr,i, arr.length-1);
        	
        	int temp= arr[i];
        	arr[i]=arr[min_index];
        	arr[min_index]=temp;
        	
        }
        
        for(int i=0; i<arr.length;i++) {
        	
        	System.out.print(arr[i]+" ");
        }
        
       
       
       
       
	}

}

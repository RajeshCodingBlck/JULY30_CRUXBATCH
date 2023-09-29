package Lec14;

public class Subarray_cut {
   public static void display(int [] arr, int s, int e) {
	   
	    for(int i=s; i<=e;i++) {
	    	
	    	System.out.print(arr[i]+" ");
	    }
	    
	    System.out.println();
   }
   
   public static int SumofSubarray(int [] arr, int s, int e) {
	   
	    int sum=0;
	    
	    for(int i=s;i<=e;i++) {
	    	sum+=arr[i];
	    }
	    
	    return sum;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {-2,1,-3,4,-1,2,1,-5,4};
       
       int maxsum= Integer.MIN_VALUE;
              
		for(int s=0;s<arr.length;s++) {
			
			int sum=0;// B
			
			for(int e=s;e<arr.length; e++) {
				
				  sum= sum+ arr[e];
				 maxsum= Math.max(maxsum, sum);
			}
		}
		
		System.out.println(maxsum);
	}

}

package Lec14;

public class Subarray {
  
	public static void display(int [] arr, int s , int e) {
		
		
		for(int i=s; i<=e;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
	}
	
	public static int sum(int [] arr, int s, int e) {
		
		int sum=0;
		
		for(int i=s; i<=e;i++) {
			sum+=arr[i];
		}
		
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {-2,1,-3,4,-1,2,1,-5,4};
      
      int ans=Integer.MIN_VALUE;
      
       for(int s=0;s<arr.length;s++) {
    	   
    	   for(int e=s;e<arr.length;e++) {
    		   
//    		   display(arr, s, e);
    		   
    		   int currsum=sum(arr, s, e);
    		   
    		   ans= Math.max(ans, currsum);
    	   }
    	   
    	   
       }
       
       System.out.println(ans);
	}

}

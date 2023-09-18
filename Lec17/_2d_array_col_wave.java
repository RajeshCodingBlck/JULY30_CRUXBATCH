package Lec17;

public class _2d_array_col_wave {
   public static void display(int [][] arr) {
	   
	    // col ke respect me loop chalega
	   for(int j=0; j<arr[0].length;j++) {
		   
		   
		   if(j%2==0) {
			   
			   for(int i=0;i<arr.length;i++) {
				   
				   System.out.print(arr[i][j]+" ");
			   }
		   }else {
			   
			   for(int i=arr.length-1; i>=0;i--) {
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
		 
		display(arr);

	}

}

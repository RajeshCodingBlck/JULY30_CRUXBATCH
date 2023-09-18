package Lec17;

public class Searching_in2d_array {
    public static int find(int [][] arr, int target) {
    	
    	int row=0;
    	
    	int col=arr[0].length-1;
    	
    	while(row< arr.length && col>=0) {
    		
    		 if(arr[row][col]==target) {
    			 return 1;
    		 }else if(arr[row][col]>target){
    			 col--;
    		 }else {
    			 row++;
    		 }
    	}
    	
    	return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] [] arr= {{28,33,45},
    		            {31,34,46},
    		             {57,60,77}
       };
       
       
       System.out.println(find(arr, 32));
       
	}

}

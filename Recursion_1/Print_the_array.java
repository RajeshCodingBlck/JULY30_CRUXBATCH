package Recursion_1;

public class Print_the_array {
   
	public static void print(int [] arr, int i) {
		
		  if(i==arr.length) {
			  return;
		  }
		
		 System.out.print(arr[i]+" ");
		 print(arr, i+1);
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,12,3,4,5};
      
      print(arr, 0);
      
      
      
	}

}

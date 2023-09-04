package Lec10;

public class swap_demo2 {
   public static void swapfun(int [] arr, int i, int j) {
	   int temp=arr[i];
	   arr[i]=arr[j];
	   arr[j]=temp; 
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,3,4,5};
      System.out.println("Before the Swap "+ arr[0]+" "+ arr[1]);
      swapfun(arr,0, 1);
      System.out.println("After the Swap "+ arr[0]+" "+ arr[1]);
	}

}

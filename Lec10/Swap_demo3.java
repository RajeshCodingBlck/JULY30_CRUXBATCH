package Lec10;

public class Swap_demo3 {
   
	public static void Swap(int [] arr, int [] brr) {
		
		int [] temp=arr;
		arr=brr;
		brr=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,3,4,5};
      int [] brr= {10,12,13,14,15};
      
      System.out.println("Before the Swap "+arr[0]+" "+arr[1]);
      
      Swap(arr, brr);
      
      System.out.println("After the Swap "+ arr[0]+" "+arr[1]);
	}

}

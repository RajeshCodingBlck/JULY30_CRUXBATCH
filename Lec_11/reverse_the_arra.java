package Lec_11;

public class reverse_the_arra {
   public static int []  reverse_method1(int [] arr) {
	   
	   int [] brr= new int [arr.length];
	   int index=0;
	   
	   for(int i=arr.length-1;i>=0;i--) {
		   
		   brr[index]=arr[i];
		   index++;
	   }
	   
	   return brr;
	   
	   
	   
	   
   }
   
   public static void reverse(int [] arr) {
	   
	   int i=0;
	   int j=arr.length-1;
	   
	   
	   while(i<=j) {
		   
		   int temp= arr[i];
		   arr[i]=arr[j];
		   arr[j]=temp;
		   i++;
		   j--;
	   }
	   
	   
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int [] arr= {12,3,4,5,14};
		
//		 arr=reverse_method1(arr);
		
		reverse(arr);
		
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}

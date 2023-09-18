package Lec13;

public class Insertion_Sort {
    
	public static void insert(int [] arr, int i, int item) {
		
		 
		 while(i>=0 &&  arr[i]>item) {
			 
			 arr[i+1]=arr[i]; // shifting.
			 i--;
		 }
		 
		 arr[i+1]=item;
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {2,4,5,12,19,3};
       
//       insert(arr, arr.length-2,arr[arr.length-1]);
       
       for(int i=1; i<arr.length;i++) {
    	   
    	   insert(arr, i-1,arr[i]);
       }
       
       for(int i=0; i<arr.length;i++) {
    	   System.out.print(arr[i]+" ");
       }
       
	}

}

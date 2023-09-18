package Lec12;

public class Bubble_Sort {
   
	public static void BubbleSort(int [] arr) {
		
		 for(int round=1; round<arr.length;round++) {
			 
			 for(int j=0; j<arr.length-round; j++) {
				 
				  if(arr[j]>arr[j+1]) {
					  
					  int temp= arr[j];
					  arr[j]=arr[j+1];
					  arr[j+1]=temp;
				  }
			 }
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {5,4,3,2,1};
      
      BubbleSort(arr);
      
      for(int i=0; i<arr.length;i++) {
    	  
    	  System.out.print(arr[i]+" ");
      }
      
	}

}

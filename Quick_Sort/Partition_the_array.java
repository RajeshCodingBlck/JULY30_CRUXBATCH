package Quick_Sort;

public class Partition_the_array {
    
	public static int partition(int [] arr, int s, int e) {
		
		//int n= e-s+1;
		int pivot=arr[e];
		
		int index=s;
		
		for(int i=s; i<=e;i++) {
			
			if(arr[i]>=pivot) {
				continue;
			}else {
				
			  // Swap between (index, i)
				
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				index++;
				
			}
		}
		
		int temp=arr[e];
		arr[e]=arr[index];
		arr[index]=temp;
		
		return index;
	}
	
	public static void Sort(int [] arr, int s, int e) {
		
		
		if(s>=e) {
			return ;
		}
		
		int pivot_index= partition(arr, s, e);
		
		Sort(arr, s, pivot_index-1);
		Sort(arr, pivot_index+1,e);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  int [] arr= {20,12,3,5,10,7};
	  
//	   System.out.println(partition(arr));
	  
	    Sort(arr, 0, arr.length-1);
	   
	   for(int i=0;i<arr.length;i++) {
		   
		   System.out.print(arr[i]+" ");
	   }
	   
	   
	}

}

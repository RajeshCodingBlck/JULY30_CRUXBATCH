package Lec15;

public class Binary_search {
    
	public static int Binary_Search(int [] arr, int val) {
		
		int low=0;
		
		int high=arr.length-1;
		
		while(low<=high) {
			
			int mid=(low+high)/2;
			
			if(arr[mid]==val) {
				return mid;
			}else if(arr[mid]>val) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		int [] arr= {2,3,5,7,12,30};
		
		int val=3;
		
		System.out.println(Binary_Search(arr, val));
	}

}

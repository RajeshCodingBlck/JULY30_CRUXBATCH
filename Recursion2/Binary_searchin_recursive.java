package Recursion2;

public class Binary_searchin_recursive {
    
	public static boolean Binar_search(int [] arr, 
			int low, int high, int target){
		
		if(low>high) {
			return false;
		}
		
		int mid= (low+high)/2;
		
		if(arr[mid]==target) {
			return true;
		}else if(arr[mid]>target) {
			
			return Binar_search(arr, low, mid-1, target);
		}else {
			 return Binar_search(arr, mid+1, high, target );
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

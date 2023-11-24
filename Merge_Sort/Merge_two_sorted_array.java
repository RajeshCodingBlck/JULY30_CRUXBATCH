package Merge_Sort;

public class Merge_two_sorted_array {

	public static int [] Merge(int [] arr1, int [] arr2) {
		
		int n= arr1.length;
		int m= arr2.length;
		
		int [] ans= new int[n+m];
		
		int i=0;// for arr1
		int j=0;// for arr2
		
		int index=0; // for ans array
		
		while(i<n && j<m) {
			
			if(arr1[i]<arr2[j]) {
				ans[index]= arr1[i];
				index++;
				i++;
			}else {
				ans[index]= arr2[j];
				index++;
				j++;
			}
		}
		
		while(i<arr1.length) {
			ans[index]= arr1[i];
			index++;
			i++;
		}
		
		while(j<arr2.length) {
			ans[index]= arr2[j];
			index++;
			j++;
		}
		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr1= {1,2,3,4,5,10,13,15};
       int [] arr2= {2,3,5,10,11,20,22,24};
       
       int [] merge_array= Merge(arr1, arr2);
       
       for(int i=0; i<merge_array.length;i++) {
    	   
    	   System.out.print(merge_array[i]+" ");
       }
	}

}

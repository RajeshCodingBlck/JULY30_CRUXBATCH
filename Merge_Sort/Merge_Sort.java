package Merge_Sort;

public class Merge_Sort {
    
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

	public static int [] Sort(int [] arr, int s, int e) {
		
		if(s==e) {
			
			int [] ans= new int[1];
			
			ans[0]=arr[s];
			
			return ans;
		}
		
		
		
		int mid=(s+e)/2;
		
		int [] left= Sort(arr, s, mid);
		int [] right= Sort(arr, mid+1,e);
		
		int [] ans=Merge(left, right);
		 
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int [] arr= {3,10,2,5,7,10};
		
		int [] ans= Sort(arr, 0, arr.length-1);
		
		for(int i=0; i<ans.length;i++) {
			
			System.out.print(ans[i]+" ");
		}
	}

}

package Lec_11;

public class Sum_of_array {

	
	public static int sum(int [] arr) {
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum= sum+arr[i];
		}
		
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr= {1,2,3,4,5,6};
        
        
        int ans= sum(arr);
        
        System.out.println(ans);
        
        
	}

}

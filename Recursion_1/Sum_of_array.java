package Recursion_1;

public class Sum_of_array {
    
	public static int Sum_of_array(int [] arr, int i){
		
		if(i==arr.length) {
			
			return 0;
		}
		
		int chhota_ans= Sum_of_array(arr, i+1);
		
		int bada_ans= arr[i]+chhota_ans;
		
		 return bada_ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int [] arr= {1,2,3,4};
		 
		 System.out.println(Sum_of_array(arr, 0));
		 
	}

}

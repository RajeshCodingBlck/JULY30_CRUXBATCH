package Two_Array_Question;

public class SearchIn_two_array {

	public static int Search(int [] [] arr, int target) {
		
		int i=0;
		int j=arr[0].length-1;
		
		while(i<arr.length && j>=0) {
			
			
			if(arr[i][j]>target) {
				j--;
			}else if(arr[i][j]<target) {
				i++;
			}else {
				return 1;
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] [] arr= {
    		   {1,2,2,4,5},
    		   {2,4,5,7,10},
    		   {3,4,6,7,18}
       };
       
       System.out.println(Search(arr, 3));
       
       
	}

}

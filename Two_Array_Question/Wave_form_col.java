package Two_Array_Question;

public class Wave_form_col {
   
	public static void Wave(int [] [] arr) {
		
		
		// col 
		
		for(int j=0; j< arr[0].length;j++) {
			
			if(j%2==0) {
				
				for(int i=0; i<arr.length;i++) { // row
					System.out.print(arr[i][j]+" ");
				}
			}else {
				
				for(int i= arr.length-1; i>=0;i--) { // row
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] arr= {
	    		   {1,2,3,4},
	    		   {5,6,7,8},
	    		   {10,11,12,30}
	       };
	       
	       Wave(arr);
	}

}

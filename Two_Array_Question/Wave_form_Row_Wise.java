package Two_Array_Question;

public class Wave_form_Row_Wise {
   public static void Wave(int [][]  arr) {
	   
	   
	    for(int i=0; i<arr.length;i++) {  // i is for Row
	    	
	    	
	    	 if(i%2==0) {
	    		 
	    		 for(int j=0; j<arr[0].length; j++) {
	    			 System.out.print(arr[i][j]+" ");
	    		 }
	    	 }else {
	    		 
	    		 for(int j=arr[0].length-1; j>=0; j--) {
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

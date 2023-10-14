package twoD_aaray;

public class Spiral_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] [] arr= {
        		 {1,2,3,4},
        		 {5,4,3,2}
         };
         
         int minr=0;
         int maxr= arr.length-1;
         
         int minc=0;
         int maxc=arr[0].length-1;
         
         int count=0;
         
         int total= arr.length*arr[0].length;
         
         
         while(count<total) {
        	 
        	 for(int i=minc; count<total && i<=maxc;i++) {
            	 System.out.print(arr[minr][i]+" ");
            	 count++;
             }
             minr++;
             
             for(int i=minr; count<total && i<=maxr; i++) {
            	 System.out.print(arr[i][maxc]+" ");
            	 count++;
             }
             
             maxc--;
             
             for(int i=maxc; count<total && i>=minc;i--) {
            	 System.out.print(arr[maxr][i]+" ");
            	 count++;
             }
             
            maxr--;
            
            for(int i=maxr;count<total &&  i>=minr;i--) {
            	System.out.print(arr[i][minc]+" ");
            	count++;
            }
            
            minc++;
         }
        
        
         
	}

}

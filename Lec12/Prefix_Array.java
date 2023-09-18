package Lec12;

public class Prefix_Array {
   
	public static int []  Prefix_sum(int [] arr) {
		
		int [] prefix= new int [arr.length];
		
		prefix[0]=arr[0];
		
		for(int i=1; i<arr.length;i++) {
			
			prefix[i]= prefix[i-1]+arr[i];
		}
		
		return prefix;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int [] arr= {1,2,3,4,5};
		
		int [] prefix= Prefix_sum(arr);
		
		
		for(int i=0; i<prefix.length;i++) {
			
			System.out.print(prefix[i]+" ");
		}
		
		
	}

}

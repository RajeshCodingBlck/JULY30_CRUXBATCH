package Lec6;
import java.util.*;
public class SumPlaceValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      
      int n=s.nextInt();
      
      int evensum=0;
      int oddsum=0;
      
      int i=1;
      
      while(n>0) {
    	  
    	  int ld= n%10;
    	  
    	  if(i%2==0) {
    		  evensum+=ld;
    	  }else {
    		  oddsum+=ld;
    	  }
    	  
    	  i++;
    	  n=n/10;
      }
      
      System.out.println("EvenSum is "+evensum+", OddSum is "+oddsum);
      
	}

}

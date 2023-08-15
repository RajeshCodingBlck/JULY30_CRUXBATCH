package Lec5;
import java.util.*;

public class Digit_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		
		int divisor= s.nextInt();
		
		int divident=s.nextInt();
		
		while(divident%divisor !=0) {
			
			int rem= divident%divisor;
			divident=divisor;
			divisor=rem;
			
		}
		
		System.out.println(divisor);
		
		
	}

}

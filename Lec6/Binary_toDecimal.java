package Lec6;
import java.util.*;
public class Binary_toDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		
		int n=s.nextInt();
		
		int mul=1;
		
		int ans=0;
		
		while(n>0) {
			
			int ld= n%10;
			
			ans= ans+ ld*mul;
			
			mul=mul*2;
			n=n/10;
			
		}
		
		System.out.println(ans);
	}

}

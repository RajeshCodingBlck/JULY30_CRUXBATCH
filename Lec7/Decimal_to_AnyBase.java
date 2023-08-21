package Lec7;

import java.util.*;

public class Decimal_to_AnyBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		
		int n=s.nextInt(); // iska Base 10 hoga ye pata he
		int b=s.nextInt();
		
		int ans=0;
		
		int place_value=1;
		
		while(n>0) {
			
			int rem= n%b;
			
			ans= ans+ rem*place_value;
			
			n=n/b;
			place_value*=10;
		}
		
		System.out.println(ans);
		
		
	}

}

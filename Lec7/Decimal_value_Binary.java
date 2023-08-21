package Lec7;
import java.util.*;

public class Decimal_value_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		
		int place_value=1;
		
		int ans=0;
		
		while(n>0) {
			
			int rem= n%2;
			
			ans= rem*place_value+ ans;
			
			n=n/2;
			place_value*=10;
			
		}
		
		System.out.println(ans);
		
	}

}

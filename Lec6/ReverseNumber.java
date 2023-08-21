package Lec6;
import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();
		
		int ans=0;
		
		while(n>0) {
			
			int ld= n%10;
			
			ans= ans*10+ld;
			n=n/10;
		}
		
		System.out.println(ans);
		
	}

}

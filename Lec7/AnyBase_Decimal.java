package Lec7;
import java.util.*;
public class AnyBase_Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	Scanner s= new Scanner(System.in);
	
	int n=s.nextInt();
	int b=s.nextInt();
	
	int ans=0;
	
	int mul=1;
	
	while(n>0) {
		
		int ld= n%10;
		
		ans= ans+ ld*mul;
		
		mul=mul*b;
		
		n=n/10;
		
	}
	
	System.out.println(ans);
		
	}

}

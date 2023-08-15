package Lec5;
import java.util.*;

public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	Scanner s=new Scanner(System.in);
	
	int n=s.nextInt();
	
	int a=0;
	int b=1;
	
	 for(int i=1; i<=n;i++) {
		 System.out.println(a);
		 int c=a+b;
		 a=b;
		 b=c;
		 
	 }
	 
	 System.out.println(a);
		
	}

}

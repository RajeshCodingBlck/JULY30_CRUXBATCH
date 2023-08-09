package Lec2;

import java.util.*;
public class while_lec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		
		int count=1;
		
		int sum=0;
		
		while(count<=n) {
			
			sum= sum+count;
			count=count+1;
		}
		
		System.out.println(sum);
		
	}

}

package Lec9;

public class Fun_demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.println("Main is Start");
		
		int a=13;
		int b=12;
		System.out.println(add(a,b));
		System.out.println("Main is End");
	}
	
	public static int add(int a, int b) {
		
		System.out.println("Add fun is Start and Take Something");
		int c=a+b;
		
		System.out.println(c);
		
		System.out.println("Add fun is End");
		
		return c;
		
	}

}

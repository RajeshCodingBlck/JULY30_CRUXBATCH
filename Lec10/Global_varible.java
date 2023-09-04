package Lec10;

public class Global_varible {
	
	static int b=10; // global Varible.
	

	public static void fun() {
		
		int b=20;
		
		System.out.println("fun is start");
		System.out.println( b);
		b++;
		System.out.println("fun is End");
		
	}
	public static void fun2() {
		
		System.out.println("fun2 is start");
		System.out.println( b);
		System.out.println("fun2 is End");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		fun();
		fun2();
	}

}

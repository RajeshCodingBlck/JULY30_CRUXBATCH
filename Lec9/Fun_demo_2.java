package Lec9;

public class Fun_demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Main is Start");
       
       System.out.println(addtwoNumber());
       
       System.out.println("Main is End");
	}
	
	public static int addtwoNumber() {
		
		System.out.println("Add is Start");
		int a=12;
		int b=13;
		
		int c= a+b +sub();
		System.out.println(c);
		
		System.out.println("Add is end");
		
		return c;
		
		
	}
	// return something 
	public static int sub() {
		
		int a=12;
		int b=13;
		int c= a-b;
		return c;
	}

}

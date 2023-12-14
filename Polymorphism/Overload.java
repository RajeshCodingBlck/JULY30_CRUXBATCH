package Polymorphism;

public class Overload {
   
	public static int sum(int a, int b) {
		
		return a+b;
	}
	
   public static double sum(double a, double b) {
		
		return a+b;
	}
    
//    public static void fun(Integer a) {
//    	
//    	System.out.println("Integer is called");
//    }
//    
//    public static void fun(int a) {
//    	
//    	
//    	System.out.println("Int is called");
//     }
    
   //case 3:
//    public static void fun(String str) {
//    	
//    	System.out.println("String is called");
//    }
//    
//    public static void fun(Object a)
//    {
//    	
//    	System.out.println("object is called");
//    }
    
    // case 4
    
    public static void fun(String a) {
    	
    	System.out.println("B");
    }
    
    
    public static void fun(StringBuffer a) {
    	
    	System.out.println("C");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println(sum(2,3));
		
		System.out.println(sum(3.0,5.0));
		
		System.out.println(sum(3,9.0));
		
		
		 fun("abc");
		
		
		
	}

}

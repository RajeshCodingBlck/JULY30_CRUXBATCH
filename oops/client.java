package oops;

public class client {
   
	public static void swap(Test a, Test b) {
		
		Test temp= a;
		a=b;
		b=temp;
		
		
	}
	
	
 public static void swap2(Test t1, Test t2) {
		
		
	 int temp= t1.a;
	 t1.a=t2.a;
	 t2.a=temp;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Test obj1= new Test(12);
      Test obj2= new Test(13);
      
       System.out.println("Before the Swap "+ obj1.a+ " "+ obj2.a);
       
       swap2(obj1, obj2);
       
       System.out.println("After the Swap "+ obj1.a+ " "+ obj2.a);
      
	}

}

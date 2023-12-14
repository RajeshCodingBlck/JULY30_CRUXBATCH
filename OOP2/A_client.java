package OOP2;

public class A_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
//		A obj =new A("rajesh@123", "1234");
//		
////		System.out.println(obj.email+ " "+ obj.password);
//		System.out.println(obj.getemail());
//		
//		obj.Set("123", "Mohan@1234");
		
		
		
//		System.out.println(obj.getemail());
//		System.out.println(obj.email+ " "+ obj.password);
		
		System.out.println(A.count);
		
		A obj1= new A("Raj@123", "1234");
		A obj2= new A("Aman@123", "3478");
		A obj3= new A("Aman@123", "3478");
//		obj1.Set("1234", "RAJ@123");
//		obj2.Set("1234", "RAJ@123");
		
		obj2.count=3;
		
		obj3.count+=1;
		
//		System.out.println(obj1.email);
		
		obj1.email="12";
		
		System.out.println(obj2.email);
		System.out.println(A.count);
		
		
		
	}

}

package OOP2;

public class A {
    
	
	  String email;
	  String password;
	 
	 static int count;
	 
	
	A(String email, String password){
		
		this.email=email;
		this.password=password;
	}
	
	public boolean Set(String password, String new_email) {
		
		if(this.password==password) {
			this.email=new_email;
			return true;
		}else {
			
			return false;
		}
	}
	
	public String getemail() {
		
		return this.email;
	}
	
	public static void fun1() {};
	
	public  void fun2() {};
	public static void get() {
		
		
		fun1();
		fun2();
		
		count=count+1;
		
	}
	
	
	
	
	
}

package OOP2;

public class A {
    
	
	private  String email;
	 private String password;
	
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
	
	
	
	
}

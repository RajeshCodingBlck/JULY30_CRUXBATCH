package Interface_demo;

public class Mobile {

	int review;
	int price;
	
	String Brand;
	
	Mobile(int review, int price, String Brand){
		
		this.review=review;
		this.Brand=Brand;
		this.price=price;
	}
	
	void show() {
		
		System.out.println(Brand+" "+ price);
	}
	
}

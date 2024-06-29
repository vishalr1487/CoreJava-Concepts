package Constructor;

public class Bike {
	
	// This is Zero Argument Constructor
	
	String brand;
	double price;
	int quantity;
	
	public Bike() {
		
		brand= "Hyundai";
		price=250000;
		quantity=2;
		
	}
	
	

	public static void main(String[] args) {

		
		Bike b=new Bike();
		
		System.out.println("brand="+ b.brand);
		System.out.println("price=" + b.price);
		System.out.println("quantity="+ b.quantity);
		
		
		
	}

}

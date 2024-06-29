package constructors;

public class ZeroArgCons {

	String brand;
	int quantity;
	int price;

	public ZeroArgCons() {

		brand = "GoodDay";
		quantity = 50;
		price = 25;

	}

	public static void main(String[] args) {

		ZeroArgCons b1 = new ZeroArgCons();
		System.out.println("Brand = " + b1.brand);
		System.out.println("Price = " + b1.price);
		System.out.println("Quantity = " + b1.quantity);

		ZeroArgCons b2 = new ZeroArgCons();
		System.out.println("Brand = " + b1.brand);
		System.out.println("Price = " + b1.price);
		System.out.println("Quantity = " + b1.quantity);

	}

}

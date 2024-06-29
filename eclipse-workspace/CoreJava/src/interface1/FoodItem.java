package interface1;

public class FoodItem implements Taxable {

	@Override
	public double getTax() {

		String FoodItemName = "Pizza";
		int price = 1500;
		int qty = 5;
		double tax = 0;

		System.out.println("Food Item Name is:" + FoodItemName);
		System.out.println("Food Item price is:" + price);
		System.out.println("Food Item quantity is:" + qty);
		System.out.println("Tax is:" + tax);

		return tax;

	}
}

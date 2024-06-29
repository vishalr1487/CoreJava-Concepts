package inheritence;

public class EletronicItem {

	public double getTax(){
		

		String FoodItemName = "Mobile";
		int price=24000;
		int qty= 2;
		double tax=10;
		
		
		System.out.println("Food Item Name is:"+ FoodItemName);
		System.out.println("Food Item price is:"+ price);
		System.out.println("Food Item quantity is:"+ qty);
		System.out.println("Tax is:"+ tax);
		return tax;
		
		
	
	}
}

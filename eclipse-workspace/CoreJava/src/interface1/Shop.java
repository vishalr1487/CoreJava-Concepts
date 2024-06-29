package interface1;

public class Shop {

	public static void main(String[] args) {

		MedicalItem mi = new MedicalItem();
		mi.getTax();

		FoodItem fi = new FoodItem();
		fi.getTax();

		ElectronicItem ei = new ElectronicItem();
		ei.getTax();

	}

}

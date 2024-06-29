package abstraction2;

public class Shop {

	public static void main(String[] args) {
		MedicalItem mi=new MedicalItem();
		 
		mi.accept("Paracetamol", 25, "January", 2022);
		mi.show();
		
	
	}

}

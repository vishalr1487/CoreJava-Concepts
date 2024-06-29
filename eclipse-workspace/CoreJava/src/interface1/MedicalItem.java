package interface1;

public class MedicalItem implements Taxable{
	
	@Override
	public double getTax(){
		

		String MedicineName = "Paracetamol";
		int price=1000;
		int qty= 10;
		double tax=5;
		
		
		System.out.println("Medicine Name is:"+ MedicineName);
		System.out.println("Medicine price is:"+ price);
		System.out.println("Medicine quantity is:"+ qty);
		System.out.println("Tax is:"+ tax);
		
		return tax;
		
			
	}	
	
}
	 
	
	


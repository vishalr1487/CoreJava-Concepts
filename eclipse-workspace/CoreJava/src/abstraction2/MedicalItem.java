package abstraction2;

public class MedicalItem {
	
	String Medicinename;
	int Priceofmedicine;
	String expmonth;
	int expyear;


	public void accept(String Medicinename, int Priceofmedicine, String expmonth, int expyear)
	{
		
		this.Medicinename=Medicinename;
		this.Priceofmedicine=Priceofmedicine;
		this.expmonth=expmonth;
		this.expyear=expyear;
		
	}
	// Default Constructor
	MedicalItem(){
		
	}
	// Parameterized Constructor
	MedicalItem(String Medicinename, int Priceofmedicine, String expmonth, int expyear){
		
		this.Medicinename=Medicinename;
		this.Priceofmedicine=Priceofmedicine;
		this.expmonth=expmonth;
		this.expyear=expyear;
		
		
	}
	public void show(){
		System.out.println("Medicinename is : " + this.Medicinename);
		System.out.println("Priceofmedicine is : " + this.Priceofmedicine);
		System.out.println("expmonth is : " + this.expmonth);
		System.out.println("expyear is : " + this.expyear);
	}
	
	

}

package inheritence;

public class VehicleLoan extends Loan1{
	
	String Interest ="3%";
	int amount=500000;
	
	@Override
	void verify(){
		System.out.println("Documents Verification");
		System.out.println("Rate Of Interest:" + Interest);
	}
	
	@Override
	void getAmount(){
		System.out.println("VehicleLoan amount is" + amount);
	}
	
	
	

}

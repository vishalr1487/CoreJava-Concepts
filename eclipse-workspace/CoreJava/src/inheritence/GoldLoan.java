package inheritence;

public class GoldLoan extends Loan1{
	 
	String Interest ="5%";
	int amount=100000;

	@Override
	void verify(){
		System.out.println("Ornaments Verification");
		System.out.println("Rate Of Interest:" + Interest);
	}
	
	@Override
	void getAmount(){
		System.out.println("GoldLoan amount is" + amount);
	}
	
	}
	
	



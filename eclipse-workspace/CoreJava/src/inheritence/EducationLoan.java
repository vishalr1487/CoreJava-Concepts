package inheritence;

public class EducationLoan extends Loan1{
	
	
	String Interest ="0%";
	int amount=800000;
	
	@Override
	void verify(){
		System.out.println("Marks sheet Verification");
		System.out.println("Rate Of Interest:" + Interest);
	}
	
	@Override
	void getAmount(){
		System.out.println("EducationLoan amount is" + amount);
	}

}

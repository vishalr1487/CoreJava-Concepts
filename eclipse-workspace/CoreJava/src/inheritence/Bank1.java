package inheritence;

public class Bank1 {

	public static void main(String[] args) {
		
		
		GoldLoan g=new GoldLoan();
		
		g.verify();
		g.getAmount();
		
		VehicleLoan v=new VehicleLoan();
		
		v.verify();
		v.getAmount();
		
		EducationLoan e=new EducationLoan();
		
		
		e.verify();
		e.getAmount();
		
		

	}

}

package abstraction2;

public class Bank {

	public static void main(String[] args) {
		Loan l=new Loan();
		
		l.accept("Personal Loan", 100000);
		l.show();
		
		// parametrized constructor
		Loan loan = new Loan("House Loan", 20000);
		loan.accept("Personal Loan", 100000);
		loan.show();

	}

}

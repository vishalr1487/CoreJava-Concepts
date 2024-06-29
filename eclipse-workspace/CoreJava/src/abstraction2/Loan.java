package abstraction2;

public class Loan {
	
	String loanType;
	Double loanAmount;
	
	
	// Default Constructor
	public Loan() {
	
	}
	// Parameterized Constructor
	public Loan(String loanType, double loanAmount)
	{
		 this.loanType=loanType;
		 this.loanAmount=loanAmount;
		 	
    }
	
	public void  accept(String loanType, double loanAmount)
	{
	
	 this.loanType=loanType;
	 this.loanAmount=loanAmount;
	 	
	}
	public void show()
	{
		System.out.println("loanType :"+ this.loanType);
		System.out.println("loanAmount :"+ this.loanAmount);

}
}

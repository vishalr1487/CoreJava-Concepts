package exceptionhandling;

public class Transaction {

	public void amountTransfer(Account fromacc, Account toacc, double amt) throws Exception {
		try {
		if (fromacc.getAccno() == toacc.getAccno()) {

			throw new InvalidAccountNumberException();
		}

		else {

			System.out.println("From Account Number : " + fromacc.getAccno());
			System.out.println("To Account Number : " + toacc.getAccno());
			
		}
		} catch(InvalidAccountNumberException e) {
			
			throw new Exception("Invalid Account Number");
			
		}
		try {
			
			if (amt <= 0) {

				throw new InvalidAmountException();
				
			}
			
		  System.out.println("Amount : " + amt);
		
		  fromacc.setAccbal(fromacc.getAccbal() - amt);
		  
		  System.out.println("Account balance in "+fromacc.getAccno() + " is " + fromacc.getAccbal());
		}catch(InvalidAmountException e){
			
			throw new Exception("Invalid Amount");
		}
		System.out.println("Amount succesfully transferred");

	}

}

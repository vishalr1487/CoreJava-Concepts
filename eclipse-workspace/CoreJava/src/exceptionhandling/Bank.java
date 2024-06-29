package exceptionhandling;

public class Bank {

	public static void main(String[] args) throws Exception{
		
	
		Account a1=new Account("123456", "Vishal" , 100000);
		Account a2=new Account("235462", "Avi" , 200000);
		
	
		Transaction t=new Transaction();
		
		t.amountTransfer(a1, a2, 25000);
		
	}

}

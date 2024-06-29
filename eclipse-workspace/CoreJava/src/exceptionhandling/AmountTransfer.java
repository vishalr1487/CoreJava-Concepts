package exceptionhandling;

public class AmountTransfer {
	
	public static void amountTransfer(int fromaccno, int toaccno, int amt) throws Exception
	{
		
		
		
		if(fromaccno==toaccno){
			System.out.println("Invalid Account Number");
		}
		else{
			
			System.out.println("Enter From Account Number : " + fromaccno);
			System.out.println("Enter To Account Number : " + toaccno);
			
			
		}
		
		if(amt<=0 ){
			
			System.out.println("Invalid Amount");	
		}
		else{
			System.out.println("Enter the Amount : " + amt);
			
		
		}
		
		if(amt<0){
			throw new Exception();
		}
	}
	
	

	public static void main(String[] args) {
		
		int fromaccno=12345;
		int toaccno=12348;
		int amt=25000;
		
		try{
			System.out.println("Login to the system");
			System.out.println("Enter the amount to be Transferred");
			amountTransfer( fromaccno,  toaccno, amt);
		}
		catch(Exception e){
			System.out.println("Unable to Transfer the amount");
		}
		finally{
			System.out.println("Logged out from the system");
		}
		
	}
	
}


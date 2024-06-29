package methodOverloading;

public class MainClass {

	public static void main(String[] args) {
		

		PhonePe p = new PhonePe();
		p.amountTransfer("HDFC12345", 321456415, "VISHAL.B");    // ifsc, accNo, acc holder name
		p.amountTransfer(2145623, "VINAY.B");					// acc number, acc holder name
		p.amountTransfer(789456135); 							// acc number
		
		
		

	}

}

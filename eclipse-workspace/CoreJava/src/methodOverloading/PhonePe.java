package methodOverloading;

public class PhonePe {

	public void amountTransfer(String IFSC, int actNo, String accName) {

		System.out.println("AMOUNT TRANSFER DONE VIA IFSC CODE ");

	}

	public void amountTransfer(int accNumber, String accHolderName) {

		System.out.println("AMOUNT TRANSFER DONE VIA ACCOUNT NUMBER");
	}

	public void amountTransfer(int mobileNumber) {

		System.out.println("AMOUNT TRANSFER DONE VIA MOBILE NUMBER");

	}

}

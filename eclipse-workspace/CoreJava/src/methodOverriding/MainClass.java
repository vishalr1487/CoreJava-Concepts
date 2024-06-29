package methodOverriding;

public class MainClass {

	public static void main(String[] args) {
		
		SBI sbi = new SBI();
		ICICI ici = new ICICI();
		AXIS axis = new AXIS();
		
		System.out.println("SBI Rate Of Interest is : " + sbi.getRateOfInterest());
		System.out.println("ICICI Rate Of Interest is : " + ici.getRateOfInterest());
		System.out.println("AXIS Rate Of Interest is : " + axis.getRateOfInterest());
		
		sbi.laugh();
		

	}

}

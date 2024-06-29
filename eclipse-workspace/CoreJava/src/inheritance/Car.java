package inheritance;

public class Car extends Vehicle{
	
	
	private String modelName1 = "Ertiga";
	private String modelName2 = "Baleno";
	private String modelname3 =  "Brezza";
	
	public  void startUsingRemote() {
		
		System.out.println("IT CAN BE START USING REMOTE");
	}

	public static void main(String[] args) {
		
		
		Car myCar = new Car();
		
		myCar.startUsingKey();
		myCar.honk();
		myCar.stop();
		System.out.println(myCar.brandName + " " + myCar.modelName1);
		myCar.startUsingRemote();
		
	}

}

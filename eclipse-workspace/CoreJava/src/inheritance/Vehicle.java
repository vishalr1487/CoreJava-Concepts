package inheritance;

public class Vehicle {

	protected String brandName = "Maruthi Suzuki";
	// protected keyword used because that variable can be accessed only within the
	// package and outside the class

	public void startUsingKey() {

		System.out.println("This car can be started using key");

	}

	public void startWithoutUsingKey() {

		System.out.println("This car can be started without using key");

	}

	public void honk() {

		System.out.println("Honk method executed");

	}

	public void stop() {

		System.out.println("Stop method executed");

	}

}

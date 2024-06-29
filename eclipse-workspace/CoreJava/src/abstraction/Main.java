package abstraction;

public class Main {
	
	public static void mainClassMethod() {
		System.out.println("main class method executed");
	}

	public static void main(String[] args) {
		
		
		
		Pig myPig = new Pig();
		myPig.animalSound();
		myPig.sleep();
		System.out.println();
		
		mainClassMethod();
		
		

	}

}

package methods;

public class Main {
	
	
	/* We can OVERLOAD main method but, we cannot OVERRIDE main method as main method is STATIC.
	 * STATIC METHODS CANNOT BE OVERRIDEN
	 * The static methods in java is associated with 'CLASS', & non-static methods are associated with 'Object'.
	 * 
	 * WHY MAIN METHOD IS STATIC?
	 * As we know, we can access static contents without creating the objects.
	 * Because of the static keyword with main method JVM can directly call it without creating the object of the class.
	 * This way it will provide kind of root to start execution of the program.
	 */
	
	

	static void myMethod() {

		System.out.println("myMethod executed");

	}

	public void myMethod(String name, int RollNo) {

		System.out.print(name + " " + RollNo);

	}

	public static void main(String[] args) {

		myMethod(); // using static keyword

		Main main = new Main(); // without using static keyword by creating object.
		main.myMethod("Vishal", 25);

	}

}

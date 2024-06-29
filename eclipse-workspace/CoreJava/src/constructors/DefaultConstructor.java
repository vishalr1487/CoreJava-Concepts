package constructors;

public class DefaultConstructor {

	/*
	 * Constructors cannot be grouped as static or non static Constructor name must
	 * be same as class name It is same as method but it doesn't return any value
	 * but method will return
	 *
	 * Every Default constructor will be zero argument constructor
	 */

	public DefaultConstructor() {
		System.out.println("I am insde the Default Constructor");
	}

	public void getData() {
		System.out.println("I am in the getData() method");
	}

	public static void main(String[] args) {
		//whenever you create an object Constructor is called bydefault
		DefaultConstructor dc = new DefaultConstructor();
		 dc.getData();
	}

}

package callByReference;

public class Operation2 {

	/*
	 * In case of call by reference original value is changed if we made changes in
	 * the called method. If we pass object in place of any primitive value,
	 * original value will be changed. In this example we are passing object as a
	 * value. Let's take a simple example:
	 */

	int data = 50;

	public void change(Operation2 op) // passing object inside the method
	{
		op.data = op.data + 100; // changes will be in the instance variable
	}

	public static void main(String[] args) {
		Operation2 op = new Operation2();

		System.out.println("Before change: " + op.data);
		op.change(op); // passing object
		System.out.println("After change: " + op.data);

	}

}

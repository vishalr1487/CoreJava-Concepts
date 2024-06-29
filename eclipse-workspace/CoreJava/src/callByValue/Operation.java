package callByValue;

public class Operation {
	
	/*
	 * 
	 * There is only call by value in java, not call by reference. If we call a method passing a value, it is known as call by value. 
	 * The changes being done in the called method, is not affected in the calling method.
	 * 
	 * Ex: In case of call by value original value is not changed. Let's take a simple example:
	 */
	
	
	
	int data = 50;
	public void change(int data)    // passing variable inside the object
	{
		data = data + 100;   	// changes will be in the local variable only
	}
	
	public static void main(String[] args) {
		
		Operation op = new Operation();
		System.out.println("Before change:" + op.data);
		op.change(50);
		System.out.println("After change:" + op.data);
		
	}

}

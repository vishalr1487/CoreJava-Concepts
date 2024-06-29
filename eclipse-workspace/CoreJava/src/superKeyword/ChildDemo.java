package superKeyword;

public class ChildDemo extends ParentDemo {

	String name = "I am from Bangalore";

	public ChildDemo() {

		super(); // this line should be the first line inside the child class constructor.
		System.out.println("Child class constructor");

	}

	public void getStingData() {
		System.out.println(name);
		System.out.println(super.name);
	}

	public void getData() {
		super.getData();
		System.out.println("child class getData method");

	}

	public static void main(String[] args) {

		ChildDemo cd = new ChildDemo();
		cd.getStingData();
		cd.getData();

	}

}

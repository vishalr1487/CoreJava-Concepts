package thisAndSuperKeywords;

public class ChildClass extends ParentClass {

	String s = "Child Class Variable";
	int a = 3;

	public void method1() {

		int a = 2;

		int b = a + this.a; // if you want to print sum of global and local variable
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);

	}

	/*
	 * public static void method2() { // cannot use this and super keyword for
	 * static context
	 * 
	 * System.out.println(s); System.out.println(this.s);
	 * System.out.println(super.s); // compile time error }
	 */

	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		c.method1();

	}

}

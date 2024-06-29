package interfacePackage;

public class Mathematics implements DemoInterface, DemoInterface2, DemoInterface3 {

	public static void main(String[] args) {

		 
		Mathematics math = new Mathematics();
		math.add();
		math.substract();
		math.multiply();
		math.diffentialCalculus();
		math.integralCalculus();
		DemoInterface.duplicateMainMethod();       // since we cannot create object for interface so  (InterfaceName.methodName)
		//(InterfaceName.methodName)
	}

	@Override
	public  void add() {

		System.out.println("ADD METHOD EXECUTED");

	}

	@Override
	public void substract() {

		System.out.println("SUBSTRACT METHOD EXECUTED");
	}

	@Override
	public void multiply() {
		System.out.println("MULTIPLY METHOD EXECUTED");
	}

	@Override
	public void diffentialCalculus() {
		System.out.println("differentialCalculus METHOD EXECUTED");
		
	}

	@Override
	public void integralCalculus() {
		System.out.println("integralCalculus METHOD EXECUTED");
		
	}

	@Override
	public void matrix() {
		System.out.println("matrix METHOD EXECUTED");
		
	}

	@Override
	public void algebra() {
		System.out.println("algebra METHOD EXECUTED");
		
	}

	@Override
	public void gemoetry() {
		System.out.println("geometry METHOD EXECUTED");
		
	}

	@Override
	public void trignometry() {
		System.out.println("trignometry METHOD EXECUTED");
		
	}

}

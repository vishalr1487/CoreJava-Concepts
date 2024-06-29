package abstraction;

public  class Mathematics extends DemoAbstractClass{

	public static void main(String[] args) {

		Mathematics math = new Mathematics();
		math.add();
		DemoAbstractClass.multiply();
		math.division();
		math.substract();
		
	}

	@Override
	public void add() {
		System.out.println("add method executed");
	}

	@Override
	public void substract() {
		System.out.println("substract method executed");
		
	}

	@Override
	public void division() {
		System.out.println("division method executed");
		
	}

}

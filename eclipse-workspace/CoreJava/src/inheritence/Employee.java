package inheritence;

public class Employee extends Person {

	
	Employee(long id, String name, double salary) {
		super(id, name);
		this.salary = salary;
		
	}

	double salary;
	
	public void show() {
		System.out.println("Employee id :"+this.id + "\nEmployee Name: " + this.name + "\nEmployee salary: "+ this.salary);
	}
	
}

package inheritence;

public class TestInheritance {
	
	public static void main(String []args) {
		
	
		Person p=new Person(123,"Vish");
		Employee e=new Employee(1234, "Vishal.B", 500000);
		Student s=new Student(123, "Vishalll", 625);
		
		
		//Person e1=new Employee(000, "Manohar", 500000);
		
		//e1.show();
		p.show();
		e.show();
		s.show();
		
	}
}

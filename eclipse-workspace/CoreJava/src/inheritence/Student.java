package inheritence;

public class Student extends Person{

	Student(long id, String name, int marks) {
		super(id, name);
		this.marks = marks;
	}

	int marks;
	public void show() {
		System.out.println("\nStudent id:"+this.id + "\nStudent Name: " + this.name + "\nStudent marks: "+ this.marks);
	}
	
}

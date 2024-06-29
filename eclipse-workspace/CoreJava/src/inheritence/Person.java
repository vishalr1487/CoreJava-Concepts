package inheritence;

public class Person {

	
		
		long id;
		String name;
		
		Person(long id, String name) {
			this.id = id;
			this.name = name;
		}
		
		

		public void show() {
			System.out.println(this.id + " Name :" +this.name);
		}

}

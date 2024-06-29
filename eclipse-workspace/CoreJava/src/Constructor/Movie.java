package Constructor;

public class Movie {
	
	// This is parameterized constructor 

	String name;
	long budget;
	double members;
	int cameras;
	
	public Movie(String N, long B, double M, int C){
	
		this.name=N;
		this.budget=B;
		this.members=M;
		this.cameras=C;

	}
	
	public static void main(String[] args) {
		
		System.out.println("Main method started");
		Movie obj= new Movie("Bahubali", 25000000, 2000, 250);
		System.out.println("name=" + obj.name);
		System.out.println("budget=" + obj.budget);
		System.out.println("members=" + obj.members);
		System.out.println("cameras=" + obj.cameras);
		System.out.println("Main method ended");


	}

}

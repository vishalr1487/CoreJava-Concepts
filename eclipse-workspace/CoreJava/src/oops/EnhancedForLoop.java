package oops;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		// FOR INTEGRS
		int primes[] = {1,2,5,67,54,89,54,34};
		
		for(int numbers: primes) {
		
		System.out.print( numbers + " ");
		}
		
		System.out.println();
		
		// FOR STRING
		String languages[] = {"Java", "Python", "SQL", "Ruby", "API"};
		
		for(String sample: languages) {
			System.out.print(sample + " ");
		}
		

	}

}

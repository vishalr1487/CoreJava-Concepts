package basicPrograms;

public class StarConsole {

	public static void main(String[] args) {
		
		int i, j;
		// i = rows and j= No of stars
		
		for(i=1; i<=10; i++) {
			
			for(j=1; j>=i; j--) {
				
				System.out.print("*" + " ");
			}
			
			System.out.println();
		}
		
	}

}

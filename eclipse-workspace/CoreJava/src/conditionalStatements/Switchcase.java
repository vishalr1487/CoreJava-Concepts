package conditionalStatements;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Java has a multiway decision statement known as switch.
		//The switch statement tests the value of a given variable or expression against 
		// a list of case values & when a match is found, a block of statements associated with that case is executed.
		
		//The fundamental difference between if-else and switch statements is that 
		//The if-else statement �selects the execution of the statements based upon the evaluation of the expression in if statements�. 
		//The switch statements �selects the execution of the statement often according to a keyboard command�.
		
		
		
		String choice=new String();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("choose your division:");
		System.out.println("Honors");
		System.out.println("First");
		System.out.println("Second");
		System.out.println("Third");
		System.out.println("Fail");
		System.out.println("Enter your choice---->");
		
		 try
		 {
			 
			 choice =br.readLine();
			System.out.flush();
			switch(choice) 
			{
		 
		 
		
		
		
		case"Honors":
			System.out.println("Marks >=80%");
			break;
		case "First":
			System.out.println("Marks>=65% and < 80%");
			break;
		case "Second":
			System.out.println("Marks>=55% and < 65%");
			break;
		case "Third":
			System.out.println("Marks>=40% and < 55%");
			break;
		case "Fail":
			System.out.println("Marks<40");
			break;
			
			default:
			System.out.println("Invalid Choice");
			
			}
		 }
		 catch (Exception e)
		 {
			 System.out.println("I/0 Error");
		 }
		
	
	}

}

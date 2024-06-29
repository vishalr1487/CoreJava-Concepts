package conditionalStatements;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		int number[]= { 50,65,56,71,81,84,87,96,97};
		int even =0, odd=0;
		for(int i=0; i<number.length; i++)
		{
			if((number[i]) % 2==0)
			{
				
				even++;
				
			}
			else
			{
				odd++;
				
			}
			
		}
		System.out.println("Even Numbers= "+ even + "Odd Numbers= "+ odd);
		System.out.println("main method ended");

	}
}
	
package exceptionhandling;

public class InvalidageException extends java.lang.Exception {

	public InvalidageException() {
		
	}
	public static void main(String[] args) {
		
		
		
		int age=18;
		
		try{
			System.out.println("Validate the age");
			Validate(age);
		}
		catch (InvalidageException e){
			System.out.println("Invalid Age");
		}
		finally
		{
			System.out.println("Person Age is validated");
		}
		

	}

	private static void Validate(int age) throws InvalidageException {
		
		
		if(age<=0 || age>100){
			throw new InvalidageException();
		}
		else if(age==0 || age>=18 ){
			System.out.println("Person is Major and Age is:" + age);
		}
		else {
			System.out.println("Person is Minor and Age is:" + age);
		}
		
			
	}

}

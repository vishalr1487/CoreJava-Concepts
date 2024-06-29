package exceptionhandling;

public class Person {

	public static void main(String[] args) {
		
		
		
		int age=2500;
		
		try{
			System.out.println("Validate the age");
			Validate(age);
		}
		catch (Exception e){
			System.out.println("Age is Invalid");
		}
		finally
		{
			System.out.println("Person Age is validated");
		}
		

	}

	private static void Validate(int age) throws Exception {
		
		
		if(age<=0 || age>100){
			throw new Exception();
		}
		else if(age==0 || age>=18 ){
			System.out.println("Person is Major and Age is:" + age);
		}
		else {
			System.out.println("Person is Minor and Age is:" + age);
		}
		
			
	}
}



	
	
		
		
		
		
	











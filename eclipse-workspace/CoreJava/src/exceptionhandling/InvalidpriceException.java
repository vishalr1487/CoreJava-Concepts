package exceptionhandling;

public class InvalidpriceException extends java.lang.Exception{

	public InvalidpriceException() {
		
	}
	
	public static void main(String[] args) {
		

		String ProductName= "Mobile Phone";
		int ProductPrice=0;
		
		try{
			System.out.println("Print Product Details");
			ProductDetails(ProductName, ProductPrice);
		}
		catch(InvalidpriceException e){	
			System.out.println("Invalid Price");
		}
		finally{
			System.out.println("Product Details are Printed");
		}
		
		
		
	}

	private static void ProductDetails(String productName, int productPrice) throws InvalidpriceException {
	
		
		if(productPrice<=0){
			throw new InvalidpriceException();
			
		}
		else{
			System.out.println("Product Price is Valid");
			System.out.println("Product Name is: " +  productName);
			System.out.println("Product Price is: " +  productPrice);
		}
		
	}

	
}

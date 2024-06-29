package exceptionhandling;

public class Product {

	public static void main(String[] args) {
		

		String ProductName= "Mobile Phone";
		int ProductPrice=0;
		
		try{
			System.out.println("Print Product Details");
			ProductDetails(ProductName, ProductPrice);
		}
		catch(Exception e){	
			System.out.println("Unable to Print Product Details");
		}
		finally{
			System.out.println("Product Details are Printed");
		}
		
		
		
	}

	private static void ProductDetails(String productName, int productPrice) throws Exception {
		
		
		if(productPrice<=0){
			throw new Exception();
			
		}
		else{
			System.out.println("Product Price is Valid");
			System.out.println("Product Name is: " +  productName);
			System.out.println("Product Price is: " +  productPrice);
		}
		
	}

}

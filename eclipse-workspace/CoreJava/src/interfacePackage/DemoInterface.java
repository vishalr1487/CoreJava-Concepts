package interfacePackage;

/* INTERFACE : It is a type of java program which is use to achieve 100% abstraction.
 * Members of Interface:
 * 
 * INTERFACE CAN HAVE CLASS AS ONLY PUBLIC AND ABSTRACT BUT IT CANNOT HAVE PRIVATE, PROTECTED, FINAL.
 * 
 * ABSTRACT CLASS cannot have class as PRIVATE, PROTECTED 
 * but it can either have ABSTRACT or FINAL not both.
 * 
 * 	public static final DATATYPE variableName = value;
 *  public abstract (return type) (method name) (arguments);
 *  
 *  Inside an interface we can write only 2 things:
 *  Data Members : which are by default PUBLIC STATIC FINAL 
 *  Member Functions: which are PUBLIC ABSTRACT
 *  
 *  Interface do not have the constructors
 *  WE CANNOT CREATE OBJECT FOR THE INTERFACE.
 *  A class can extends only one class where as A class can implements multiple interfaces. 
 *  One Interface can extends another Interface.
 *  
 *  CAN WE PROVIDE IMPLEMENTATION WITHIN INTERFACE:? YES. Only after java 1.8 version
 *  
 *  V1.7 ---> ONLY ABSTRACT METHODS
 *  V1.8 ---> DEFAULT & STATIC METHODS 
 *  V1.9 ----> PRIVATE METHODS
 *  
 */

public interface DemoInterface {

	public abstract void add();

	public void substract();

	public abstract void multiply();
	
	public static void duplicateMainMethod() {
		System.out.println("DUPLICATE MAIN METHOD EXECUTED");
	}

}




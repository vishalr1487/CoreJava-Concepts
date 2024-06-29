package arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {

		/*
		 * We can define the array in 2 ways : 
		 * 1st way : int arr[]= new int[5]; 
		 * 2nd way : int ar[]= {3,4,5,6,7}; // when you know the values of the array
		 */

		int[] j = new int[5]; // Declares an array and allocates memory for the variable
		j[0] = 10;
		j[1] = 20;
		j[2] = 30;
		j[3] = 40;
		j[4] = 50; // Array index starts from zero

		j[2] = 90; // Here we can re-initialize the value of an array as 90 in j[2] index.

		System.out.println(j[2]);

		int[] m = { 1, 2, 3, 4 }; // array initialization.
		System.out.println(m[3]); // output = 4;

		String s[] = new String[3]; // [null, null, null, null]
		s[0] = "java";
		s[1] = "python";
		s[2] = "selenium";

		System.out.println(s[2]);

		boolean b[] = new boolean[4]; // [false, false, false, false]

		b[0] = true;
		b[1] = false;

		System.out.println(b[1]);

		/*
		 * While defining the array you should define the size of the array as well.
		 * Once it is defined then you cannot change the size of an array. 
		 * So they introduced array list concept. 
		 * The default array value of 'int' is 'zero'.
		 * The default array value of 'String' is 'null'.
		 * The default array value of 'Boolean' is 'false'.
		 */

	}

}

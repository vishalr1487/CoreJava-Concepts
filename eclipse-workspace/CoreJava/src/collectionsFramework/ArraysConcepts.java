package collectionsFramework;

import java.util.ArrayList;

public class ArraysConcepts {

	public static void main(String[] args) {

		int a[] = new int[4]; // this is static array ---- size is fixed
		a[0] = 1;
		a[1] = 2;
		a[2] = 89;
		a[3] = 4;

		System.out.println(a[2]);

		// Dynamic array--- ArrayList
		// It can contains duplicate values
		// It maintains insertion order
		// it is synchronized
		// It allows random access to fetch element coz it stores the values in the form
		// of indexes

		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(45);
		ar.add(100);

		System.out.println(ar.size()); // to get the size of arraylist

		System.out.println(ar.get(2)); // to get the value from the index

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		// Generic and non generic

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(200);
		arr.add(765);
		arr.add(34);
		// arr.add("Selenium"); ----- cannot add bcoz its is string;

		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("test");
		ar1.add("vishal");
		ar1.add("afkdfkdsfkds");
		
	

		System.out.println(arr.get(2));
		System.out.println(ar1.get(2));

	}

}

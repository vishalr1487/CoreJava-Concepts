package collectionsFramework.List;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<String>();
		l.add("Vishal");
		l.add("Vinay");
		l.add("Avinash");
		l.add("mahesh");
		l.add("zebra");
		l.add("xavier");
		
		System.out.println(l);
		
		l.add(3, "Naveen");
		
		System.out.println(l);
		
		System.out.println("Array Size :" +  l.size());
		
		l.remove(2);
		System.out.println(l);
		
		
		
		

	}

}

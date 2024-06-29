package collectionsFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcepts {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		ll.add("abcd");
		ll.add("manohar");
		ll.add("java");

		System.out.println(ll); // to get all the elements
		System.out.println(ll.get(2)); // to get the specific elements

		ll.addFirst("SELENIUM FIRST ELEMENT");
		ll.addLast("LAST ELEMENT");

		System.out.println(ll);

		// get and set method

		System.out.println(ll.get(0));

		// set method

		System.out.println(ll.set(0, "LAST ELEMENT"));
		System.out.println(ll.set(4, "first element"));
		System.out.println(ll);

		// System.out.println(ll.remove(4));
		System.out.println(ll);

		// ll.removeFirst();
		// ll.removeLast();

		// to print all the elements from the linked list

		// using for loop

		System.out.println("Using for loop:");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		// using for each loop

		System.out.println("using for each loop");
		for (String str : ll) {
			System.out.println(str);
		}

		// using iterator

		System.out.println("using iterator");

		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// using while loop

		int num = 0;
		while (ll.size() > num) {
			System.out.println(ll.get(num));
			num++;
		}

	}

}

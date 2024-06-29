package mapsInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Selenium");
		map.put(2, "Java");
		map.put(3, "Python");
		map.put(4, "Testing");

		// System.out.println(map.get(2));
		// System.out.println(map.get(1)); // it prints single value

		// if you want to print all the values from the map then iterate :

		for (Entry<Integer, String> m : map.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());

		}
		map.remove(3);
		System.out.println(map);

		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();

		Employee e1 = new Employee("Tom", 25, "admin");
		Employee e2 = new Employee("steve", 26, "dev");
		Employee e3 = new Employee("peter", 28, "testing");

		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);

		for (Entry<Integer, Employee> m : emp.entrySet()) {

			int key = m.getKey();
			Employee e = m.getValue();

			System.out.println("Employee " + key + " Info: ");
			System.out.println(e.name + " " + e.age + " " + e.dept);
		}

	}

}

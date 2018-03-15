package hashmapconcept;

import java.util.HashMap;
import java.util.Map.Entry;

import employee.employee;

public class hashmapconceptt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashmap is a class implements Map Interface
		//Extends abstract 
		// it contains only unique elements
		// Stores the value key value pair
		//i may have null key and multiple null values
		// it maintains no order
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium1");
		hm.put(2, "Selenium2");
		hm.put(3, "Selenium3");
		hm.put(4, "Selenium4");
		hm.put(5, "Selenium5");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(3));
		System.out.println(hm.get(4));
		
		
		//iterate with entry set
		
		
		for(Entry<Integer, String> m : hm.entrySet()){
			System.out.println(m.getKey() + " "+ m.getValue());
		}
		
		System.out.println(hm);
		
		hm.remove(4); // no order is maintained
		System.out.println(hm);
		
		HashMap<Integer ,employee> emp = new HashMap<Integer, employee>(); 
		employee e1 = new employee("Aman", 27, "QA");
		employee e2 = new employee("Aman1", 28, "QA1");
		employee e3 = new employee("Aman2", 29, "QA2");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		
		// to traverse hashmap use entry set. it will create a set of values 
		
		for (Entry<Integer ,employee> m : emp.entrySet()) {
		 int key =	m.getKey();
		 employee em = m.getValue();
		 System.out.println(key + " " + "info");
		 System.out.println(em.name + " " + em.age + " "+ em.dept);
		  
			
		}
	}

}

package arraylistconcept;

import java.util.ArrayList;
import java.util.Iterator;

import employee.employee;

public class ArratList {
	
	public static void main(String[] args) {
	//Static array is fixed whereas array list is non static
	// can contain dulpicate values
	//maintain insertion order
		
	// non generic array list it can store all type of primitive 
	ArrayList ar = new ArrayList();
	ar.add(10);
	ar.add(20);
	ar.add(30);
	ar.add(12.33);;
	ar.add("test");
	System.out.println(ar);
	
	System.out.println(ar.size());

	System.out.println(ar.get(2));
	
	// to print all values in array list 
	// for loop
	// iterator 
	
	for (int i=0; i<ar.size(); i++){
		System.out.println(ar.get(i));
	}
	
	ArrayList<Integer> ar1 = new ArrayList<Integer>();
	//ar1.add("test"); in generic array list only defined type of data primitives can be added in ar1 only integers can be added
	
	ar1.add(1);
	ar1.add(2);
	ar1.add(3);
	ar1.add(4);
	ar1.add(5);
	ar1.add(6);
	
	System.out.println(ar1);
	
	ArrayList<String> ar2 = new ArrayList<String>();
	ar2.add("test1");
	ar2.add("test2");
	ar2.add("test3");
	ar2.add("test4");
	ar2.add("test5");
	ar2.add("test6");
	ar2.add("test7");
	
	Iterator<String> it1 = ar2.iterator();
	while (it1.hasNext()){
		System.out.println(it1.next());
	}
	
	employee e1 = new employee("Aman", 27, "QA");
	employee e2 = new employee("Aman1", 28, "QA1");
	employee e3 = new employee("Aman2", 29, "QA2");
	
	ArrayList<employee> ar3 = new ArrayList<employee>();
	ar3.add(e1);
	ar3.add(e2);
	ar3.add(e3);
	
	// iterator is required to traverse 
	 Iterator<employee> it = ar3.iterator();
	  while(it.hasNext()){
		  employee e = it.next();
		  System.out.println(e.age + " "+ e.dept + " "+ e.name); 
		  System.out.println("************");
		  ArrayList<String> ar4 = new ArrayList<String>();
		  ar4.add("selenium");
		  ar4.add("selenium1");
		  ar4.add("selenium2");
		  ar4.add("selenium3");
		  System.out.println("************");
		  System.out.println(ar4);
		  ArrayList<String> ar5 = new ArrayList<String>();
		  
		  ar5.add("selenium4");
		  ar5.add("selenium5");
		  ar5.add("selenium6");
		  ar5.add("selenium7");
		  
		  System.out.println(ar5);
		  System.out.println("************");
		  ar5.addAll(ar4);
		  System.out.println(ar5);
		  System.out.println("************");
		  ar5.removeAll(ar4);
		  System.out.println(ar5);
	  }
	 
	}
}

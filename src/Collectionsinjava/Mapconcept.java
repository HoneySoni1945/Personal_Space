package Collectionsinjava;

import java.util.HashMap;
import java.util.Map.Entry;


public class Mapconcept {
//Hashmap is  a class implemets Map interface
	//extends AbstractMap
	// it contains only unique element
	//stores value  in key value pair 
	// it may have one null key and multiple null values
	//it maintains no order
	// hash map is not synchronized.. i.e multiple thread can access hasmap ... not thread safe... fail fast condition can occur
	//concurrent modification exception -- fail fast condition
	public static void main(String agr[]) {
HashMap<Integer,String> hm= new HashMap<Integer,String>();
	
	hm.put(1,"test");
	hm.put(2,"Java");
	hm.put(3,"tarun");
	
	System.out.println(hm.get(1));
	System.out.println(hm.getOrDefault(3, "ad"));
	
	// how to iterate hash map
	
	System.out.println(hm.entrySet());
	
	for(Entry e:hm.entrySet()) {
		System.out.println(e.getKey() + " " + e.getValue());
	}
	
	System.out.println(hm);
	hm.remove(2);
	System.out.println(hm);
	
	HashMap<Integer,Employee> emp = new HashMap<Integer,Employee>();
	Employee e1 = new Employee("honey",28,"IT");
	Employee e2 =new Employee("tarun",29,"RAID");
	Employee e3 =new Employee("rahul", 31, "TSSC");
	
	emp.put(1, e1);
	emp.put(2, e2);
	emp.put(3, e3);
	
	for(Entry et : emp.entrySet()) {
		int key = (int) et.getKey();
		Employee e= (Employee) et.getValue();
		System.out.println("employee  " + key + "  info  " + e.age + "  " + e.name + "  "+ e.dept);
	}
	}
	
}

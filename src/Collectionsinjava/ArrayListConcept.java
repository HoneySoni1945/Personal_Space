package Collectionsinjava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//dynamic in nature 
		// can contain duplicate values/elements
		// maintains insertion order
		//not synchronized
		//allows random acces to fetch element because it stores the value on the basis os index
		
		ArrayList ar =new ArrayList();
		ar.add("honey");
		ar.add(12);
		ar.add('H');
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(0));
		
		
		//to print all values of array list 
		//1.using for loop
		//2. using iterator
		
		System.out.println(ar);
		
		for(int i =0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
	
		}
		
		//generics and non generics java1.5 
		
		ArrayList<Integer> ari =new ArrayList<Integer>();
		ari.add(12);
		//ari.add("honey");//only integer value is accepeted 
	
	ArrayList<String> ars =new ArrayList<String>();
	ars.add("soni");
	//ars.add(12); // only string
	
	// employee class object 
	Employee obj = new Employee("honey",28,"IT");
	Employee obj1=new Employee("tarun",29,"RAID");
	Employee obj2=new Employee("rahul", 31, "TSSC");
	
	// creating array list of
	ArrayList<Employee> emp =new ArrayList<Employee>();
	emp.add(obj);
	emp.add(obj1);
	emp.add(obj2);
	
	// iterator to traverse the array list
	
	Iterator<Employee> it =emp.iterator();
	
	while(it.hasNext()) {
		Employee e=it.next();
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.dept);
	}
System.out.println("for each concept");	
for(Employee ee :emp) {
	System.out.println(ee.age);
	System.out.println(ee.name);
	System.out.println(ee.dept);
}
	
// some other methods
	
//addall
ArrayList<String> arr1 = new ArrayList<String>();
arr1.add("mithila");
arr1.add("anish");
arr1.add("vikram");
arr1.add("CTDA");
ArrayList<String> arr2 = new ArrayList<String>();
arr2.add("sp");
arr2.add("jayesh");
arr2.add("anshuman");
arr2.add("CTDA");

arr1.addAll(arr2);

for(String  arrr : arr1) {
	System.out.println(arrr);
}

System.out.println("remove all **********************");

//remove all
		/*
		 * arr1.removeAll(arr2);
		 * 
		 * for(String arrr : arr1) { System.out.println(arrr); }
		 */

System.out.println("intersection retain ....common****************");
arr1.retainAll(arr2);
for(String  arrr : arr1) {
	System.out.println(arrr);
}

	}

}

package Collectionsinjava;

import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("QTP");
		ll.add("test");
		ll.add("selenium");
		ll.add("rpa");
		
		//print
		System.out.println("content of linked list " + ll);
		
		//add first
		ll.addFirst("automation");
		
		//add last
		ll.addLast("perfomance");
		System.out.println("content of linked list " + ll);
		
		// set at particular index
		ll.set(0,"elemAtZero");
		System.out.println(ll.get(0));
		System.out.println(ll);
		
		// remove first and last
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		ll.remove(2);
		System.out.println(ll);
		
		
		
		//how to iterate 
		//1.advance for loop
		//2.iterator
		//3.while loop
		//4. for loop

		
		  System.out.println("using for each");
		  
		  for (String str:ll) {
			  System.out.println(str);
		  }
		  
		  System.out.println("using iterartor");
		  Iterator<String> it = ll.iterator();
		  while(it.hasNext()) {
			  System.out.println(it.next());
		  }
	
		  System.out.println("using while loop");
		  
		  int num=0;
				  while (ll.size()>num) {
					  System.out.println(ll.get(num));
					  num++;
				  }

	System.out.println("using forloop");
	
	for(int i=0;i<ll.size();i++) {
		System.out.println(ll.get(i));
	}
	
	}

}

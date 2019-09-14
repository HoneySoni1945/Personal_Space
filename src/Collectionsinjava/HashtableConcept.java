package Collectionsinjava;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableConcept {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//it is similar to hashmap  but its is synchronized
		//stores the value on the basis of key-val
		//Key--->object--->hashCode---->value
		
		@SuppressWarnings("rawtypes")
		Hashtable h =new Hashtable();
		h.put(1,"honey");
		h.put('a',12);
		h.put("A","tarun");
		
		System.out.println(h.size());
		
		System.out.println(h.get("A"));
		System.out.println(h.get(1));
		System.out.println(h.get('a'));
		
		/*
		 * Hashtable<Integer,Integer> hi =new Hashtable<Integer,Integer>();
		 * hi.put(1,123);
		 */
		//hi.put(2,"honey");// only integer value are allowed as we have ristricted hashtable to accept only integer values
		
		Enumeration en = h.elements();
		//using enumeration
		
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		
	}

}

package com.collections.src;
import java.util.LinkedHashSet;
/**
 * LinkedHashSet class extends HashSet.
 * Maintains a linked list of entries in the set, in order in which they were inserted.
 * This allows insertion-order iteration over the set. That is, when cycling through a 
 * LinkedHashSet using an iterator, the elements will be returned in the order in which 
 * they were inserted. This is also the order in which they are contained in the string 
 * returned by toString( ) when called on a LinkedHashSet object.
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		// Create a HashSet
				LinkedHashSet<String> hs = new LinkedHashSet<String>();
				// Add elements to the HashSet
				hs.add("Beta");
				hs.add("Alpha");
				hs.add("Eta");
				hs.add("Gamma");
				hs.add("Epsilon");
				hs.add("Omega");
				System.out.println(hs);
	}
}

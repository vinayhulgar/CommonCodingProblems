package com.collections.src;

import java.util.TreeSet;

public class CompDemo {

	public static void main(String[] args) {
		
		// Create a TreeSet
		TreeSet<String> ts = new TreeSet<>(new MyComp().reversed());
		// Add elements to tree
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		
		// Display the elements
		for(String element : ts){
			System.out.print(element+" ");
			System.out.println();
		}
	}

}

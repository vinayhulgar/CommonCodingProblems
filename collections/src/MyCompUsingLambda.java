package com.collections.src;

import java.util.TreeSet;

/**
 * Use a lambda expression to create a reverse comparator.
 */
public class MyCompUsingLambda {
	public static void main(String[] args) {
		// Pass a lambda expression to create a reverse comparator
		TreeSet<String> ts = new TreeSet<>((aStr,bStr) -> bStr.compareTo(aStr));
		// Add elements to TreeSet
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

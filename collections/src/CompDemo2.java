package com.collections.src;

import java.util.TreeSet;
/**
 * Use lambda Expression to create a reverse comparator
 */
public class CompDemo2 {
	public static void main(String [] args){
		// Pass the reverse comparator to TreeSet via Lambda expression
		TreeSet<String> ts = new TreeSet<>((aStr,bStr) -> bStr.compareTo(aStr));
		// Add elements to TreeSet
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		// Display the elments
		for(String s : ts){
			System.out.println(s+" ");
		}
	}
}
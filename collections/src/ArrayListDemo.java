package com.collections.src;
import java.util.ArrayList;
/**
 * ArrayList Class extends AbstractList & implements List interface.
 * Supports Dynamic Arrays that can grow as needed.
 * Constructors:
 * 			ArrayList()
 * 			ArrayList(Collection<? extends E> c)
 * 			ArrayList(int capacity)
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		// Create an ArrayList
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Initial Size of al:"+al.size());
		// Add elements to arraylist
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(1,"A2");
		System.out.println("Size of al after additions"+al.size());
		// Remove elements from arraylist
		al.remove("F");
		al.remove(2);
		System.out.println("Size of al after deletions:"+al.size());
		System.out.println("Contents of al"+al);
	}
}
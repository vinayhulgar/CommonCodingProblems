package com.collections.src;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
/**
 * Iterator: Used to access through collections.
 * Each of the collection classes provides an iterator( ) method that returns an iterator 
 * to the start of the collection. By using this iterator object, you can access each element 
 * in the collection, one element at a time. In general, to use an iterator to cycle through 
 * the contents of a collection, follow these steps:
 * 1. Obtain an iterator to the start of the collection by calling the collection's iterator( ) method.
 * 2. Set up a loop that makes a call to hasNext( ). Have the loop iterate as long as hasNext( ) returns true.
 * 3. Within the loop, obtain each element by calling next( ).
 * 
 * For collections that implement List, you can also obtain an iterator by calling listIterator( ). 
 * As explained, a list iterator gives you the ability to access the collection in either the forward
 * or backward direction and lets you modify an element. Otherwise, ListIterator is used just like Iterator.
 */
public class IteratorDemo {
	public static void main(String[] args) {
		// Create an ArrayList
		ArrayList<String> al = new ArrayList<>();
		// Add elements to ArrayList
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		// Use Iterator to Display the contents of al.
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()){
			String element = itr.next();
			System.out.println(element +" ");
		}
		System.out.println();
		// Modify the objects being iterated.
		ListIterator<String> listr = al.listIterator();
		while(listr.hasNext()){
			String element = listr.next();
			listr.set(element + "+");
		}
		System.out.println("Modified contents of al: ");
		itr = al.iterator();
		while(itr.hasNext()){
			String element = itr.next();
			System.out.println(element +" ");
		}
		System.out.println();
		// Now display the list backwards
		System.out.println("Modified List backwards: ");
		while(listr.hasPrevious()){
			String element = listr.previous();
			System.out.println(element + "");
		}
		System.out.println();
	}
}
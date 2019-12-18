package com.collections.src;
import java.util.LinkedList;
/**
 * LinkedList Class extends AbstractSequentialList and implements List, Dequeue, Queue
 * To add elements to the start of a list, you can use addFirst( ) or offerFirst( ) 
 * To add elements to the end of the list, use addLast( ) or offerLast( ) 
 * To obtain the first element, you can use getFirst( ) or peekFirst( ) 
 * To obtain the last element, use getLast( ) or peekLast( )
 * To remove the first element, use removeFirst( ) or pollFirst( ) 
 * To remove the last element, use removeLast( ) or pollLast( )
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		// Create a Linked List
		LinkedList<String> ll = new LinkedList<String>();
		// Add elements ti Linked List
		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("E");
		ll.add("C");
		ll.addLast("Z");
		ll.addFirst("A");
		ll.add(1,"A2");
		System.out.println("Original Contents of ll:"+ll);
		// Remove the elements from linked list
		ll.remove("F");
		ll.remove(2);
		System.out.println("Contents of the list after deletion:"+ll);
		// Remove first & Last elements
		ll.removeFirst();
		ll.removeLast();
		System.out.println("ll after deleting first & last:"+ll);
		// Get & Set a value
		String val = ll.get(2);
		ll.set(2,val+"Changed");
		System.out.println("ll after changes:"+ll);
	}
}
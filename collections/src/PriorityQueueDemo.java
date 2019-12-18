package com.collections.src;
import java.util.Iterator;
import java.util.PriorityQueue;
/**
 * PriorityQueue - To process the objects in queue based on priority
 * Extends AbstractQueue & implements Queue interface
 * Doesn't allow null 
 * Can't Create PriorityQueue of Objects that are non-comparable
 * Real World Implementation: Priority Scheduling Algorithm - where 
 * each job is assigned a priority and the job with the highest priority 
 * gets scheduled first.
 */
public class PriorityQueueDemo {
	public static void main(String[] args) {
		// Creating empty Priority Queue
		PriorityQueue<String> pQueue = new PriorityQueue<String>();
		// Adding items to Queue
		pQueue.add("C");
		pQueue.add("C++");
		pQueue.add("Java");
		pQueue.add("Python");
		// Printing the most priority element
		System.out.println("Head value using peek operation"+pQueue.peek());
		// Printing all elements
		System.out.println("The queue elements::");
		Iterator<String> itr = pQueue.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		// Removing the top priority element (or head) & printing the modified queue
		pQueue.poll();
		System.out.println("After removing an element with poll function");
		Iterator<String> itr2 = pQueue.iterator();
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
		pQueue.remove("Java");
		System.out.println("After removing java with remove function");
		Iterator<String> itr3 = pQueue.iterator();
		while(itr3.hasNext()){
			System.out.println(itr3.next());
		}
		// Check if an element is present
		boolean b = pQueue.contains("C");
		System.out.println("Priority Queue Contians C or not?"+b);
		// get objects from queue in an array & print the array
		Object [] arr = pQueue.toArray();
		System.out.println("Value in array:");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i].toString());
		}
	}
}
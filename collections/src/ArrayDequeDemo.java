package com.collections.src;
import java.util.ArrayDeque;
/**
 * ArrayDeque class extends AbstractCollection and implements Dequeue interface.
 * Creates a Dynamic Array that has no capacity Restrictions.
 */
public class ArrayDequeDemo {
	public static void main(String[] args) {
		// Create an Array Deque
		ArrayDeque<String> adq = new ArrayDeque<>();
		// Use an ArrayDeque like stack
		adq.push("A");
		adq.push("B");
		adq.push("D");
		adq.push("E");
		adq.push("F");
		System.out.println("Popping the Stack:");
		while(adq.peek() !=null){
			System.out.println(adq.pop()+" ");
			System.out.println();
		}
		
	}
}

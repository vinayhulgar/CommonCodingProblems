package com.collections.src;
import java.util.ArrayList;
/**
 * If you won't be modifying the contents of a collection or obtaining elements
 * in reverse order, then the for-each version of the for loop is often a more
 * convenient alternative to cycling through a collection than is using an iterator.
 * 
 * It can only be used to cycle through a collection in the forward direction, 
 * and you can't modify the contents of the collection.
 */
public class ForEachDemo {
	public static void main(String[] args) {
		// Create a ArrayList for Integers
		ArrayList<Integer> vals = new ArrayList<>();
		// Add values to ArrayList
		vals.add(1);
		vals.add(2);
		vals.add(3);
		vals.add(4);
		vals.add(5);
		// Use for Loop to Display the values
		System.out.println("Contents Of Vals:");
		for(int v : vals){
			System.out.println(v + " ");
		}
		System.out.println();
		// Now sum the values using a for loop
		int sum =0;
		for(int v : vals){
			sum+= v;
		}
		System.out.println("Sum of Values:"+sum);
	}
}
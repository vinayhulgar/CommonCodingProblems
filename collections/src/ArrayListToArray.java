package com.collections.src;
import java.util.ArrayList;
/**
 * Converting ArrayList to array
 *  Reason: a. To obtain faster processing for certain operations
 * 			b. To pass an array to a method which is not overloaded to accept a collection
 *			c. To integrate collection based code with legacy code that does not understands collection
 */
public class ArrayListToArray {
	public static void main(String[] args) {
		// Create an ArrayList
		ArrayList<Integer> al = new ArrayList<Integer>();
		// Add elements to the ArrayList 
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println("Contents of al:"+al);
		// Get the array
		Integer ia[] = new Integer[al.size()];
		ia = al.toArray(ia);
		int sum =0;
		// Sum the array
		for(int i: ia)
			sum +=i;
			System.out.println("Sum is:"+sum);
	}
}
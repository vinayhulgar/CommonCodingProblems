package com.streams.src;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;
/**
Iterators -> 1. Traditional Iterator 2. Split Iterator (added in jdk8)
Iterators are objects that implement iterator interface(java.util) which has two key methods - hasNext() & next()
Additional Iterators to handle Primitive Streams - PrimitiveIterator, PrimitiveIterator.OfDouble, 
PrimitiveIterator.OfLong, and PrimitiveIterator.OfInt.
**/
public class StreaDemo8 {
	public static void main(String[] args) {
		// Create a List of Strings
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Alpha");
		myList.add("Beta");
		myList.add("Gamma");
		myList.add("Delta");
		myList.add("Phi");
		myList.add("Omega");
		// Obtain a Stream to the arraylist
		Stream<String> myStream = myList.stream();
		// Obtain an iterator to the stream
		Iterator<String> itr = myStream.iterator();
		// Iterate over the elements in the stream 
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
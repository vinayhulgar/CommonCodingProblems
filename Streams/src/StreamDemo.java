package com.streams.src;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;
/*
Various Stream Operations
*/public class StreamDemo {
	public static void main(String[] args) {
		// Create a list of integer values.
		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(7);
		myList.add(18);
		myList.add(10);
		myList.add(24);
		myList.add(17);
		myList.add(5);
		System.out.println("Original List is:"+myList);
		// Obtain a stream to the array list.
		Stream<Integer> myStream = myList.stream();
		// Obtain the minimum, maximum value by use of min(),
		// Max(), isPresent() & get()
		Optional<Integer> minVal = myStream.min(Integer::compare);
		if(minVal.isPresent()){
			System.out.println("Minimum Value:"+minVal.get());
		}
		// Must obtain a new Stream , coz previous call to stream
		// is termination operation that consumed the stream.
		myStream = myList.stream();
		Optional<Integer> maxVal = myStream.max(Integer::compare);
		if(maxVal.isPresent()){
			System.out.println("Maximum Value is:"+maxVal.get());
		}
		// Sort the streams using sorted()
		myStream = myList.stream();
		Stream<Integer> sortedStream = myStream.sorted();
		System.out.println("Sorted List is:");
		sortedStream.forEach((n)->System.out.println(n));
		// Display the sorted streams by use of for each
		myStream = myList.stream();
		Stream<Integer> oddVals = myStream.sorted().filter
				((n)->(n%2)==1);
		System.out.println("Odd values:");
		oddVals.forEach((n)->System.out.println(n+" "));
		System.out.println();
		// Display only the odd values that are greater than 5 
		// Two filter operations are pipelined.
		oddVals = myList.stream().filter((n)->(n%2)==1).filter
				((n)->(n>5));
		System.out.println("Odd Values Greater Than 5:");
		oddVals.forEach((n)->System.out.println(n+" "));
		System.out.println();
	}
}
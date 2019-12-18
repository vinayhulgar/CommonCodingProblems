package com.streams.src;
import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;
/**
SplitIterator - Alternative to Iterator especially in parallel processing
Methods:
1. tryAdvance(): Performs an action on next element and advances the iterator, As long as 
tryAdvance() returns true, action is 
applied on next element. It returns false when no elements remaining.
It consolidates the purpose of hasNext() & next() into single method.
2. forEachRemaining(): In some cases if you need to perform some action on each element 
collectively rather than one at a time.
It applies action to each unprocessed element and then returns.
3. trySplit():It splits the elements being iterated in two returning a new splitIterator 
to one of the partitions. 

To determine if one or more elements in a stream satisfy a specified predicate, 
use allMatch( ), anyMatch( ), or noneMatch( ).
To obtain the number of elements in the stream, call count( ).
To obtain a stream that contains only unique elements, use distinct( ).
To create a stream that contains a specified set of elements, use of( ).
**/
public class StreaDemo9 {
	public static void main(String[] args) {
		// Create a list of Strings
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Alpha");
		myList.add("Beta");
		myList.add("Gamma");
		myList.add("Delta");
		myList.add("Phi");
		myList.add("Omega");
		// Obtain the stream of ArrayList
		Stream<String> myStream = myList.stream();
		// Obtain a splitIterator
		Spliterator<String> str = myStream.spliterator();
		// Iterate the elements of stream
		while(str.tryAdvance((n)-> System.out.println(n)));
		// obtain a splitIterator
		myStream = myList.stream();
		Spliterator<String> splitItr = myStream.spliterator();
		// Now split the first Iterator
		Spliterator<String> splitItr2 = splitItr.trySplit();
		// If splitItr2 can be split use splitItr2 first
		if(null !=splitItr2){
			System.out.println("Output from splitItr2:");
			splitItr2.forEachRemaining((n)-> System.out.println(n));
		}
		// Now use the splitItr
		System.out.println("Output from splitItr:");
		splitItr.forEachRemaining((n)-> System.out.println(n));
	}
}
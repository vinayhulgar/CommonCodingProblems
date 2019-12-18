package com.streams.src;
import java.util.ArrayList;
import java.util.stream.IntStream;
//Map a Stream to an IntStream
public class StreamDemo6 {
	public static void main(String[] args) {
		// A list of Double Values
		ArrayList<Double> myList = new ArrayList<>();
		myList.add(1.1);
		myList.add(3.6);
		myList.add(9.2);
		myList.add(4.7);
		myList.add(12.1);
		myList.add(5.0);
		System.out.println("Original Values of MyList:");
		myList.stream().forEach((a)->
			System.out.println(a +" ")
		);
		System.out.println();
		// Map the ceiling of the elements in myList to an IntStream 
		IntStream cstrm = myList.stream().mapToInt((a)-> (int) Math.ceil(a));
		System.out.println("The ceiling of values in myList:");
		cstrm.forEach((a) ->
			System.out.println(a +" ")
		);
	}
}

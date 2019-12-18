package com.collections.src;
import java.util.ArrayList;
import java.util.Spliterator;
/**
 * JDK 8 added a new type of iterator called a spliterator that is defined by the Spliterator interface.
 * A spliterator cycles through a sequence of elements, and in this regard, it is similar to the iterators.
 * Important aspect of Spliterator is its ability to provide support for parallel iteration of portions of 
 * the sequence. Spliterator supports parallel programming, However, you can use Spliterator even if you 
 * won't be using parallel execution. One reason you might want to do so is because it offers a streamlined
 * approach that combines the hasNext and next operations into one method.
 */
public class SpliteratorDemo {
	public static void main(String[] args) {
		// Create an ArrayList Of Doubles
		ArrayList<Double> vals = new ArrayList<>();
		// Add Values to ArrayList
		vals.add(1.0);
		vals.add(2.0);
		vals.add(3.0);
		vals.add(4.0);
		vals.add(5.0);
		// Use tryAdvance() to display contents of vals.
		System.out.println("Contents of Vals:\n");
		Spliterator<Double> split = vals.spliterator();
		while(split.tryAdvance((n) -> System.out.println(n)));
		System.out.println();
		// Create a New List that contains Square Roots
		split = vals.spliterator();
		ArrayList<Double> sqrs = new ArrayList<>();
		while(split.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));
		// Use foreachRemaining to display the contents of sqrs
		System.out.println("Contents of sqrs:\n");
		split = sqrs.spliterator();
		split.forEachRemaining((n)-> System.out.println(n));
		System.out.println();
	}
}
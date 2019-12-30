package com.model.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class CollectorsDemo {

	public static void main(String[] args) {
		
		
		List<String> templist = Arrays.asList("dog","Cat", "Fish", "Fox", "Tiger", "cat");
		
		// TO List
		List<String> returnlist = templist.stream()
				.collect(Collectors.toList());
		
		// To Set
		Set<String> tempset = templist.stream()
				.collect(Collectors.toSet());
		
		// To Collection
		List<String> result = templist.stream()
				.collect(Collectors.toCollection(LinkedList::new));
		
		// To Map
		/*Map<String,Integer> result1 = templist.stream()
				.sorted()
				.collect(Collectors.toMap(Function.identity(), String::length));
		*/
		//System.out.println(result1);
		
		// if collection contains duplicate elements, it will throw illegalStateException
		
		Map<String,Integer> result2 = templist.stream()
				.sorted()
				.collect(Collectors.toMap(Function.identity(), String::length, (item, identicalitem) -> item));
		//System.out.println(result2);
		
		
		// Collectors.collectingAndThen
		//List<String> result3 = templist.stream()
			//	.collect(Collectors.collectingAndThen(Collectors.toList(), ImmutableList::copyOf));
		
		// Creating Unmodifiable List
		//List<String> tempArraylist = new ArrayList<String>(Arrays.asList("One", "Two", "Three"));
		//List<String> unmodifyresult = Collections.unmodifiableList(tempArraylist);
	//	unmodifyresult.add("four"); // UnsupportedOperationException
		//System.out.println(unmodifyresult);
		
		// Collectors.joining
		String result4 = templist.stream()
				.collect(Collectors.joining(" ","PRE-","-POST"));
		//System.out.println(result4);
		
		// Collectors.counting
		Long result5 = templist.stream()
				.collect(Collectors.counting());
		//System.out.println(result5);
		
		
		// SummarizingDouble/Int/long
		
		IntSummaryStatistics result6 = templist.stream()
				.collect(Collectors.summarizingInt(String::length));
		//System.out.println(result6);
		
		// Collectors.averageDouble/Long/Int
		Double result7 = templist.stream()
				.collect(Collectors.averagingDouble(String::length));
		//System.out.println(result7);
		
		// Collectors.summingDouble
		Double result8 = templist.stream()
				.collect(Collectors.summingDouble(String::length));
		//System.out.println(result8);
		
		// Collectors.maxby / minby()
		Optional <String> result9 = templist.stream()
				.collect(Collectors.minBy(Comparator.naturalOrder()));
	//	System.out.println(result9);
		
		// ******   Collectors.groupingBy()
		Map<Integer, Set<String>> result10 = templist.stream()
				.collect(Collectors.groupingBy(String::length,Collectors.toSet()));
	//	System.out.println(result10);
		
		// Collectors.partitioningBy()
		Map<Boolean, List<String>> result11 = templist.stream()
				.collect(Collectors.partitioningBy(s -> s.length() > 4));
		//System.out.println(result11);
		
		// Collectors.minBy / maxBy()
		List<Integer> numbers = Arrays.asList(1,34,61,3,6);
		Optional<Integer> min = numbers.stream()
				.collect(Collectors.minBy(Integer::compareTo));
		Optional<Integer> max = numbers.stream()
				.collect(Collectors.maxBy(Integer::compareTo));
		//System.out.println(min+ "  "+max);
		
		
		
		
	}

}

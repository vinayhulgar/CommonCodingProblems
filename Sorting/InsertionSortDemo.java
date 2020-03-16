package com.sort.src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
* Given a list l, and a new list nl
* for each element originallistelem in list l:
* for each element newlistelem in list nl:
* if (originallistelem < newlistelem):
* insert originallistelem in nl before newlistelem
* else move to the next element
* if originallistelem has not been inserted:
* insert at end of nl 
*/
public class InsertionSortDemo {
	public static void main(String[] args) {
		List<Integer> input = new ArrayList<Integer>();
		input.add(33);
		input.add(42);
		input.add(56);
		input.add(12);
		input.add(8);
		input.add(76);
		input.add(342);
		input.add(98);
		input.add(3);
		List<Integer> output = InsertionSort(input);
		System.out.println("Sorted List:");
		for(int element : output)
			System.out.println(element);
	}

	private static List<Integer> InsertionSort(List<Integer> input) {
		final List<Integer> sortedlist = new LinkedList<Integer>();
		for(int inputelement : input){
			for(int i=0; i<sortedlist.size();i++){
				if(inputelement<sortedlist.get(i)){
					sortedlist.add(i,inputelement);
					continue;
				}
			}
			sortedlist.add(sortedlist.size(),inputelement);
		}
		return sortedlist;
	}
}

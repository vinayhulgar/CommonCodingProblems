package com.sorting.src;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sample1 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(3,5,1,2,6);
		numbers.sort(Comparator.naturalOrder());
		System.out.println(numbers);
		
		List<String> cities = Arrays.asList("Milan", "london", "San Fransisco", "Tokyo", "New Delhi");
		cities.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println(cities);
		
		
		
		
		
		
		// arrays Sorting
		/*int [] array = {3,5,2,8,9,1,88,34};
		Arrays.sort(array);
		for(int i : array) {
			System.out.println(i);
		}
		
		// String arrays
		String [] arrays = {"JOHN", "Kernel", "Matt", "Scobby", "Dafny", "David"};
		Arrays.sort(arrays);
		for(String j : arrays) {
			System.out.println(j);
		}*/
		
		// Selection Sort
		//int [] arr = {33, 22,71,621,90,216,32,1,78,124,77};
		//selectionsort(arr);
	}
	private static void selectionsort(int[] arr) {
		for(int i=0;i< arr.length;i++) {
			int min = arr[i];//33
			for(int j=i;j<arr.length;j++) {
				int temp = arr[j];//22
				if(temp < min) {
					min = temp;
					arr[j] = arr[i];
					arr[i] = min;
				}
			}
		}
		
		for(int k =0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
	}

}

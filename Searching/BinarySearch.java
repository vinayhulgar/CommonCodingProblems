
import java.util.Arrays;

/*
	Binary Search is faster than linear search
	Array has to be in ascending order
	

*/public class BinarySearchDemo {

	public static void main(String[] args) {
		int [] arr = {22,56,12,78,32,67,90};
		Arrays.sort(arr);
		int key = 67;
		int last = arr.length-1;
		int result = doSearchUsingRecursion(arr,0,last,key);
		if(result < 0) {
			System.out.println("Element not found!");
		}
		else {
			System.out.println("Element found at index:"+result);
		}
		
		doSearchUsingArrays(arr);
	}

	/**
	 * Sarching an element from an array using recursion
	 */
	private static int doSearchUsingRecursion(int[] arr, int first, int last, int key) {
		if(last >= first) {
			int mid = first+(last-first)/2;
			
			if(arr[mid] == key) {
				return mid;
			}
			if(arr[mid] > key) {
				return doSearchUsingRecursion(arr, first, mid-1, key);
			}
			else {
				return doSearchUsingRecursion(arr,  mid+1, last, key);
			}
		}
		return 0;
	}

	private static void doSearchUsingArrays(int[] arr) {
		int key = 32;
		int result = Arrays.binarySearch(arr, key);
		if(result < 0) {
			System.out.println("Element not found!");
		}
		else {
			System.out.println("Element found at index:"+result);
		}
	}


}

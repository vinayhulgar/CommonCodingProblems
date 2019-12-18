package com.collections.src;
import java.util.Comparator;
/**
 * Use a Custom Comparator
 */
public class MyComp implements Comparator<String>{
	@Override
	public int compare(String aStr, String bStr) {
		// Reverse the comparison
		return aStr.compareTo(bStr);
	}
}
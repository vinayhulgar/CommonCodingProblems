package com.collections.src;
import java.util.Comparator;
/**
 * Use Comparator to sort accounts by last name.
 */
public class TComp implements Comparator<String>{
	@Override
	public int compare(String aStr, String bStr) {
		int i, j, k;
		// Find index of beginning of lastname
		i = aStr.lastIndexOf(' ');
		j = bStr.lastIndexOf(' ');
		
		k = aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
		if(k==0) // last names match, check entire names.
			return aStr.compareToIgnoreCase(bStr);
		else {
			return k;
		}
	}
}

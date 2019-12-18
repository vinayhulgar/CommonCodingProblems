package com.collections.src;

import java.util.Comparator;

public class CompThenByFirstname implements Comparator<String>{
	@Override
	public int compare(String aStr, String bStr) {
		return aStr.compareTo(bStr);
	}
}
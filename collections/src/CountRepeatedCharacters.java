package com.collections.src;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Vinay.G01
 *
 */
public class CountRepeatedCharacters {

	public static void main(String[] args) {
		String input = "SpringandHHHHHibernatefhdsjfsfsgf";
		char [] carray = input.toLowerCase().trim().toCharArray();
		Map<Character, Integer> tempmap = new HashMap<>();
		for(int i=0; i<carray.length;i++) {
			char c = carray[i];
			if(!tempmap.containsKey(c)) {
				tempmap.put(c, 1);
			}
			else {
				tempmap.put(c, tempmap.get(c)+1);
			}
		}
		Set<Character> tempset = tempmap.keySet();
		for(char c : tempset) {
			System.out.println(c+"\t"+tempmap.get(c));
		}	
	}
}

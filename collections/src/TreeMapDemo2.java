package com.collections.src;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Comparing last whole words in two strings.
 */
public class TreeMapDemo2 {
	public static void main(String[] args) {
		// Create a TreeMap
		TreeMap<String, Double> tm = new TreeMap<String, Double>(new TComp());
		// Put the elements to the map
		tm.put("John Doe", 3434.34);
	    tm.put("Tom Smith", 123.22);
	     tm.put("Jane Baker", 1378.00);
	     tm.put("Tod Hall", 99.22);
	     tm.put("Ralph Smith", -19.08);
	     // Get a set of Entries
	     Set<Map.Entry<String, Double>> set = tm.entrySet();
	     // Display the elements
	     for(Map.Entry<String, Double> me : set){
	    	 System.out.println(me.getKey()+": ");
	    	 System.out.println(me.getValue());
	     }
	     // Deposit 1000 into John Doe's Account
	     double balance = tm.get("John Doe");
	     tm.put("John Doe",balance+1000);
	     System.out.println("John Doe's new balance"+tm.get("John Doe"));
	     
	}
}
package com.collections.src;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		final IdentityHashMap<String, String> identityHashMap = new IdentityHashMap<>();
		identityHashMap.put("a", "Java");
		identityHashMap.put(new String("a"), "J2EE");
        identityHashMap.put("b", "J2SE");
        identityHashMap.put(new String("b"), "Spring");
        identityHashMap.put("c", "Hibernate");
        
        for(final String str : identityHashMap.keySet()) {
        	 System.out.println("Key : " + str + " and Value : " + identityHashMap.get(str));
        }
        System.out.println("Size of map is : " + identityHashMap.size());
        System.out.println("Here 'a' and new String('a') are considered as separate keys");
        
        final HashMap<String,String> temphashmap = new HashMap();
        temphashmap.put("a", "Java");
        temphashmap.put(new String("a"), "J2EE");
        temphashmap.put("b", "J2SE");
        temphashmap.put(new String("b"), "Spring");
        temphashmap.put("c", "Hibernate");
        for(final String str : temphashmap.keySet()) {
       	 System.out.println("Key : " + str + " and Value : " + temphashmap.get(str));
       }
       System.out.println("Size of temphashmap is : " + temphashmap.size());
	}
}

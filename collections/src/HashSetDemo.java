package com.collections.src;
import java.util.HashSet;
/**
 * HashSet extends AbstractSet & implements Set interface.
 * It creates a collection that uses a Hash Table for Storage.
 * HashTable stores information by using a mechanism called hashing.
 * 
 * In hashing, the informational content of a key is used to determine 
 * a unique value, called its hash code. The hash code is then used as the 
 * index at which the data associated with the key is stored.The transformation 
 * of the key into its hash code is performed automatically—you never see the 
 * hash code itself. Also, your code can't directly index the hash table.
 * The advantage of hashing is that it allows the execution time of add( ), 
 * contains( ), remove( ), and size( ) to remain constant even for large sets.
 * 
 * HashSet doesn't guarantee the order of its elements.
 * TreeSet does the Sorted Storage.  
 */
public class HashSetDemo {
	public static void main(String[] args) {
		// Create a HashSet
		HashSet<String> hs = new HashSet<String>();
		// Add elements to the HashSet
		hs.add("Beta");
		hs.add("Alpha");
		hs.add("Eta");
		hs.add("Gamma");
		hs.add("Epsilon");
		hs.add("Omega");
		System.out.println(hs);
	}
}
package com.collections.src;
import java.util.TreeSet;
/**
 * TreeSet Class extends AbstractSet & implements NavigableSet Interface.
 * It creates a collection that uses a tree for storage. Objects are stored
 * in sorted, ascending order. Access and retrieval times are quite fast, 
 * which makes TreeSet an excellent choice when storing large amounts of 
 * sorted information that must be found quickly.Because TreeSet implements
 * the NavigableSet interface, you can use the methods defined by NavigableSet
 * to retrieve elements of a TreeSet.
 */
public class TreeSetDemo {
	public static void main(String[] args) {
	// Create A TreeSet	
	TreeSet<String> ts = new TreeSet<String>();
	// Add elements to the Tree Set
	ts.add("C");
	ts.add("A");
	ts.add("B");
	ts.add("E");
	ts.add("F");
	ts.add("D");
	System.out.println(ts);
	System.out.println(ts.subSet("C", "F"));
	}
}
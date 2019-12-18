package com.collections.src;
import java.util.LinkedList;
/**
 * The power of collections is that they can store any type of object,
 *  including objects of classes that you create.
 */
public class MailList {
	public static void main(String[] args) {
		LinkedList<Address> ml = new LinkedList<>();
		// Add elements to Linked List
		ml.add(new Address("J.W West", "11 Oak Ave", "Urbana", " IL", "61801"));
		ml.add(new Address("J.W East", "14 Oak Ave", "Mahopet", " IL", "61853"));
		ml.add(new Address("J.W South", "16 Oak Ave", "Champaign", " IL", "61820"));
		// Display the Mailing List
		for(Address element : ml){
			System.out.println(element + "\n");
		}
		System.out.println();
	}
}

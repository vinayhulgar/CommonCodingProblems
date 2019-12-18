package com.streams.src;
import java.util.ArrayList;
import java.util.stream.Stream;
// Use map() to create a new stream that contains only
//selected aspects of the original stream.
public class StreamDemo5 {
	public static void main(String[] args) {
		// A list of name, phonenum, email adresss.
		ArrayList<NamePhoneEmail> myList = new ArrayList<>();
		myList.add(new NamePhoneEmail("Larry", "555-5555", "Larry@HerbSchildt.com"));
		myList.add(new NamePhoneEmail("James", "555-4444", "James@HerbSchildt.com"));
		myList.add(new NamePhoneEmail("Mary", "555-3333", "Mary@HerbSchildt.com"));
		System.out.println("Original Values in myList:");
		myList.stream().forEach((a)->{
			System.out.println(a.name+ " "+ a.phonenum+ " "+ a.email);
		});
		System.out.println();
		// map just the names & phonenumbers to a new Stream
		Stream<NamePhone> nameAndPhone = myList.stream().map((a)->new NamePhone(a.name, a.phonenum));
		System.out.println("List of Names & phone Numbers: ");
		nameAndPhone.forEach((a)->{
			System.out.println(a.name+ " "+ a.phonenum);
		});
	}
}
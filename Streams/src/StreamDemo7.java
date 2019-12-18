package com.streams.src;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
To obtain collection from Stream, the API provides collect() method.
It is a terminal operation.
Collectors Class having 2 methods toList(), toSet() 
**/
public class StreamDemo7 {
	public static void main(String[] args) {
		// A list of names, phone numbers & email address
		ArrayList<NamePhoneEmail> myList = new ArrayList<>();
		myList.add(new NamePhoneEmail("Larry", "555-5555", "Larry@HerbSchildt.com"));
		myList.add(new NamePhoneEmail("James", "555-4444", "James@HerbSchildt.com"));
		myList.add(new NamePhoneEmail("Mary", "555-3333", "Mary@HerbSchildt.com"));
		// Map just the name & phone numbers to a new stream
		Stream<NamePhone> nameAndPhone = myList.stream().map((a)-> new NamePhone(a.name, a.phonenum));
		// Use collect to create a list of name & phone numbers
		List<NamePhone> nplist = nameAndPhone.collect(Collectors.toList());
		System.out.println("Names and phonenumbers in a list:");
		for(NamePhone e : nplist){
			System.out.println(e.name+": "+e.phonenum);
		}
		// Obtain another mapping of the names and phone numbers
		nameAndPhone = myList.stream().map((a)-> new NamePhone(a.name, a.phonenum));
		// Create a Set by use of collect()
		Set<NamePhone> npSet = nameAndPhone.collect(Collectors.toSet());
		System.out.println("Names and phonenumbers in a Set:");
		for(NamePhone e : npSet){
			System.out.println(e.name+": "+e.phonenum);
		}
	}
}
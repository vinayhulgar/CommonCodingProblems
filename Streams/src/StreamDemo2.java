package com.streams.src;
import java.util.ArrayList;
import java.util.Optional;
/**
Demonstrate the reduce() method
min() & max() both are terminal operations, they represent reduction operations.
Other Methods: count()
Stream API generalizes this concept by reduce() - You can return a value from a
stream based on any arbitary criteria. 
**/
public class StreamDemo2 {
	public static void main(String[] args) {
		// Create a list of Integer values
		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(7);
		myList.add(18);
		myList.add(10);
		myList.add(24);
		myList.add(17);
		myList.add(5);
		// Two ways to obtain the integer product of the elements 
		// in mylist by use of reduce()
		Optional<Integer> productobj = myList.stream().reduce((a,b)->a*b);
		if(productobj.isPresent()){
			System.out.println("Product as Optional:"+productobj.get());
		}
		
		int product = myList.stream().reduce(1, (a,b)->a*b);
		System.out.println("Product as int:"+product);
		
		int evenproduct = myList.stream().reduce(1, (a,b)-> { 
			if(b%2==0) return a*b;
			else
				return a;
		});
		System.out.println("Product as even int:"+evenproduct);
	}
}
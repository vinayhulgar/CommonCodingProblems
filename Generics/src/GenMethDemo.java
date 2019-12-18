package com.Generics.src;

public class GenMethDemo {

	// Determine if the object is an array.
	static <T extends Comparable<T>, V extends T> boolean isIn(T x, V [] y){
		for(int i=0; i<y.length;i++){
			if(x.equals(y[i]))
				return true;
		}
		return false;
	}
	public static void main(String [] args){
		
		// Use isIn on integers
		Integer nums [] = {1,2,3,4,5};
		
		if(isIn(2, nums))
			System.out.println("2 is is nums");
		
		if(!isIn(7, nums))
			System.out.println("7 is not in nums");
		
		String strs [] = {"one", "two", "three", "four", "five"};
		
		if(isIn("two", strs))
			System.out.println("Two is in strs");
		
		if(!isIn("seven", strs))
			System.out.println("Seven is not in strs");
		
		// Won't Compile - types must be compatible
		//if(isIn("two", nums))
			//System.out.println("Two is in strs");
		
	}
}

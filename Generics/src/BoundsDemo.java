package com.Generics.src;

public class BoundsDemo {

	public static void main(String[] args) {
		Integer intnums[] = {1,2,3,4,5};
		Stats<Integer> iob = new Stats<Integer>(intnums);
		double v = iob.average();
		System.out.println("iob average is "+v);
		
		
		Double dnums [] = {1.1,2.2,3.3,4.4,5.5};
		Stats<Double> dob = new Stats<Double>(dnums);
		double w = dob.average();
		System.out.println("dob average is "+w);
		
		// This wont compile coz string is not a subclass of Number
		String str [] = {"1","2","3","4","5"};
		//Stats<String> sob = new Stats<String>(str);
		
		
		
		
		
		
		
	}

}

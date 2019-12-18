package com.Generics.src;

public class WildCardDemo {

	public static void main(String[] args) {
		Integer nums[] = {1,2,3,4,5};
		Stats<Integer> iob = new Stats<Integer>(nums);
		double v = iob.average();
		System.out.println("iob average is "+v);
		
		Double dnums [] = {1.1,2.2,3.3,4.4,5.5};
		Stats<Double> dob = new Stats<Double>(dnums);
		double w = dob.average();
		System.out.println("dob average is "+w);
		
		Float fnums [] = {1.0F, 2.0F,3.0F,4.0F,5.0F};
		Stats<Float> fob = new Stats<Float>(fnums);
		double x = fob.average();
		System.out.println("fob average is "+x);
		// See which arrays have same average
		System.out.println("Averages of iob & dob ");
		if(iob.sameAvg(dob))
			System.out.println("are same");
		else
			System.out.println("Differ");
		System.out.println("Averages of iob & fob ");
		if(iob.sameAvg(fob))
			System.out.println("are same");
		else
			System.out.println("Differ");
	}
}
package com.Generics.src;

public class GenDemo {

	public static void main(String[] args) {
		// Create a gen reference for Integers
		Gen<Integer> iOb;
		
		iOb = new Gen<Integer>(88);
		iOb.showType();
		
		int v = iOb.getOb();
		System.out.println("value: "+v);
		
		System.out.println();
		
		Gen<String> strObj = new Gen<String> ("Generics Test");
		strObj.showType();
		
		String str = strObj.getOb();
		System.out.println("value: "+str);
	}

}

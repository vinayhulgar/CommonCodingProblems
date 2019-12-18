package com.Generics.src;

public class Gen4 extends Gen3<String>{

	Gen4(String o) {
		super(o);
	}

	String getOb(){
		System.out.println("You called String getob()");
		return ob;
	}
	
	
	
}

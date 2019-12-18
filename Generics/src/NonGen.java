package com.Generics.src;

public class NonGen {
	
	Object ob;
	
	NonGen(Object o){
		ob =o;
	}

	Object getObj(){
		return ob;
	}
	
	void showType(){
		System.out.println("Type of ob is "+ob.getClass().getName());
	}
	
}

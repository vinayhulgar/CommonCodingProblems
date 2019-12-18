package com.Generics.src;

public class NonGenDemo {

	public static void main(String[] args) {
		NonGen iobj;
		
		iobj = new NonGen(88);
		iobj.showType();
		
		// Cast is required.
		int v = (int) iobj.getObj();
		NonGen strobj = new NonGen("Non Generics Test");
		
		strobj.showType();
		
		String str = (String) strobj.getObj();
		System.out.println("value: "+str);
		
		iobj = strobj;
		v = (Integer)iobj.getObj();
		
	}

}

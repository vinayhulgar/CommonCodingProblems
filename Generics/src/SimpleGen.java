package com.Generics.src;

public class SimpleGen {

	public static void main(String[] args) {
		TwoGen<Integer,String> tgobj = new TwoGen<Integer, String>(12, "JOHN");
		tgobj.showTypes();
		int v = tgobj.getObj1();
		System.out.println("value:"+v);
		String str = tgobj.getObj2();
		System.out.println("value:"+str);
	}
}
package com.stringhandling.src;

public class Constructors {

	public static void main(String[] args) {
		String s = new String();
		System.out.println(s);
		
		char chars[] = {'a','b','c'};
		String s1 = new String(chars);
		System.out.println(s1);
		
		char chars1[] = {'a','b','c','d','e','f'};
		String s2 = new String(chars1,2,3);
		System.out.println(s2);
		
		String s3 = new String(s2);
		System.out.println(s3);
		
		byte ascii[] = {65,66,67,68,69,70};
		String s4 = new String(ascii);
		System.out.println(s4);
		
		StringBuffer sb = new StringBuffer("StringBuffer");
		String s5 = new String(sb);
		System.out.println(s5);
		
		StringBuilder sbi = new StringBuilder("StringBuilder");
		String s6 = new String(sbi);
		System.out.println(s6);
		
		// String Length
		System.out.println("s6 lenght "+s6.length());
		
	}

}

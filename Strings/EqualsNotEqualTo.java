package com.stringhandling.src;

public class EqualsNotEqualTo {

	public static void main(String[] args) {

		String s1 = "Cat"; // Created Literal Pool
		String s2 = "Cat";//s1;//new String("Hello").intern(); // Created in Heap
		String s3 = new String("Cat");
		System.out.println("s1 equals to s2"+s1.equals(s2));
		System.out.println(s1.equals(s2)+"s1 == s2");
		System.out.println(s1);
		System.out.println(s1==s3);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}

}

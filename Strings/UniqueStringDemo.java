package com.cci.src;
/**
 * To check whether String has unique characters
 */
public class UniqueStringDemo {
	
	public static void main(String[] args) {
		boolean notunique = false;
		String input = "ATGDHYRST";
		char [] inputarr = input.toCharArray();
		for(int i=0;i<inputarr.length-1;i++){
			for(int j=i+1;j<inputarr.length;j++){
				char first = inputarr[i];
				char second = inputarr[j];
				if(first == second){
					notunique = true;
				}
			}
		}
		if(notunique){
			System.out.println("Given String doesn't have unique characters");
		}
		else{
			System.out.println("Given String is unique");
		}
	}
}

package com.begin.src;
/**
 * To delete elements from array.
 */
public class DeleteElements {
	public static void main(String[] args) {
		int [] input = {2,5,7,4,2,5};
		for(int i=0;i<input.length;i++){
			int key = input[i];
			for(int j=i+1;j<input.length;j++){
				int temp = input[j];
				if(key == temp){
					input[j] = 0;
				}
			}
		}
		for(int k=0;k<input.length;k++){
			System.out.println(input[k]);
		}

	}
}

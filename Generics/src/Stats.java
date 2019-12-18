package com.Generics.src;

public class Stats<T extends Number> {
	T [] nums;
	
	Stats(T [] o) {
		nums = o;
	}
	
	double average(){
		double sum = 0.0;
		for(int i=0; i<nums.length;i++ )
		 sum +=nums[i].doubleValue();
		return sum/nums.length;
	}
	
	// Determine if two averages are same
	boolean sameAvg(Stats<?> ob){
		if(average() == ob.average())
			return true;
		return false;
	}
	
}

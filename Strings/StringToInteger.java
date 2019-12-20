
import java.util.Arrays;

/*
* Input a line of numbers separated by space as integers
* and return ArrayList of Integers.
* ex: the String "1 2 3 4 5 6 7 8 9" is returned as an ArrayList of Integers.

*/public class StringToInteger {
	
	public static void main(String [] args) {
		String input = "1 2 3 4 5 6 7 8 9";
		int[] temp = stringToNumbers(input);
		for(int i : temp)
		System.out.println(i);
	}

	private static int[] stringToNumbers(String input) {
			return Arrays.stream(input.split(" ")).
					mapToInt(Integer::parseInt).toArray();
	}
	
	

}

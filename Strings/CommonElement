import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/*
	Finding Common Elements in Two Arrays

*/public class CommonElement {
	
	public static void main(String [] args) {
		String [] first = {"A", "B", "C","K","D"};
		String [] second = {"K", "D", "J"};
		Set<String> temp = findCommon(first, second);
		for(String i : temp)
		System.out.println(i);
	}

	private static Set<String> findCommon(String [] first, String [] second) {
		String [] temparray = Stream.concat(Arrays.stream(first),Arrays.stream(second))
				.toArray(String[]::new);
				
		Set<String> set1 = Arrays.stream(first).collect(Collectors.toSet());
		Set<String> set2 = Arrays.stream(second).collect(Collectors.toSet());
		return Arrays.stream(temparray)
				 .filter(v -> set1.contains(v) && set2.contains(v))
				 .collect(Collectors.toSet());
				
	}
}

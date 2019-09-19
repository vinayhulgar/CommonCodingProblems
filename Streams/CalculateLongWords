import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CalculateLongWords {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		List<String> templist = new ArrayList<>();
		templist.add("You have already seen that you can turn any collection");
		templist.add("into a stream with the\r\n" + 
				"stream method that Java 8 added to the Collection interface. If you have an array,\r\n" + 
				"use the static Stream.of method instead.");
		templist.add("The of method has a varargs parameter, so you can construct a stream from any\r\n" + 
				"number of arguments");
		templist.add("The Stream interface has two static methods for making infinite streams. The\r\n" + 
				"generate method takes a function with no arguments");
		templist.add("To produce infinite sequences such as 0 1 2 3 ..., use the iterate method instead.\r\n" + 
				"It takes a “seed” value and a function (technically, a UnaryOperator<T>), and\r\n" + 
				"repeatedly applies the function to the previous result. For example");
		templist.add("The first element in the sequence is the seed BigInteger.ZERO");
		// TODO : Using Streams get the duplicated characters or strings
		Map<Object, Long> frequestChars = templist.stream().filter(w -> w.equals("Stream")).
				collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		frequestChars.forEach((k,v) -> System.out.println(k+":"+v));
		long count = templist.stream().filter(w -> w.length()>14).count();
		System.out.println("Long Words Count:"+count);
		
		
	}

}

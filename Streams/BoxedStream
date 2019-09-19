import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BoxedStream {
	
	public static void main(String [] args) {
		List<String> strings = Stream.of("how","to","do","in","java").
				collect(Collectors.toList());
		
		List<Integer> ints = IntStream.of(1,2,3,4,5)
				.boxed().
				collect(Collectors.toList());
		System.out.println(ints);
		
	}

}

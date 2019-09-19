import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapvsFlatMap {

	public static void main(String[] args) {
		String [] a = {"A","B","C"};
		String [] b = {"D","E","F"};
		String [] s = flatten(a,b).toArray(String[]::new);
	}

	static<T> Stream<T> flatten(T[] a, T[] b) {
		Stream<T> stream = Stream.of(a,b).flatMap(Arrays::stream);
		return stream;
	}

	static<T> Stream<T> flattenList(List<T> a, List<T> b){
		Stream<T> stream = Stream.of(a,b).flatMap(List::stream);
		return stream;
	}
}

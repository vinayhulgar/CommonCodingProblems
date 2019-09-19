import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Sample {

	public static void main(String[] args) {
		Sample s = new Sample();
		List<Person> people = Arrays.asList(s.new Person("Micheal", "1"),
				s.new Person("Tobias","2"),
				s.new Person("Sarah","3"),
				s.new Person("Nicole","2"));
		
		// Group persons by their id
		Map<String, List<Person>> peopleByid = people.stream()
				.collect(Collectors.groupingBy(Person::getId));
		
		// print
		peopleByid.values().stream()
		.filter(peoplewithsameid -> peoplewithsameid.size()>1)
		.forEach(peoplewithsameid -> System.out.println("People with Identical Ids: " +peoplewithsameid));
				
		/*Map<String, List<String>> people = new HashMap<>();
		people.put("John", Arrays.asList("555-1123","555-3389"));
		people.put("Mary", Arrays.asList("555-2243","555-5264"));
		people.put("Steve", Arrays.asList("555-6654","555-3242"));
		
		List<String> phones = people.values().stream()
				.flatMap(Collection::stream)
				.collect(Collectors.toList());
		System.out.println(phones);
		
		List<String> names = people.keySet().stream()
				.collect(Collectors.toList());
		System.out.println(names);
		
		List<Map.Entry<String, List<String>>> specific = people.entrySet().stream()
				.filter(t -> t.getKey().equals("Steve"))
				.collect(Collectors.toList());
		System.out.println(specific);*/
		
		// 
		/*// Flatten a map containing list of items as values
		Map<Integer, List<String>> map = new HashMap<>();
		map.put(1, Arrays.asList("A","B","C"));
		map.put(2, Arrays.asList("D","E","F"));
		List<String> s = flattenMap(map.values()).collect(Collectors.toList());
		System.out.println(s);*/
		/*// Flatten a Stream of two lists of same type
		List<String> temp1 = Arrays.asList("A","B","C");
		List<String> temp2 = Arrays.asList("D","E","F");
		List<String> s = flattenList(temp1, temp2).collect(Collectors.toList());
		System.out.println(s);*/
		/*// Flatten a stream of 2 or more arrays of same type
		String [] a = {"A","B","C"}; 
		String [] b = {"C","D","E"};
		String [] c = {"F","G","H"};
		String [] s = flattenmore(a,b,c).toArray(String[]::new);
		System.out.println(Arrays.toString(s));*/
		
		// Flatten a stream of two arrays of same type
		/*String [] a = {"A", "B", "C"};
		String [] b = {"D", "E", "F"};
		String [] s = flatten(a,b).toArray(String[]::new);
		System.out.println(Arrays.toString(s));*/
				
		/*// Convert iterator to stream
		Iterator<Integer> iterator = Arrays.asList(1,2,3,4,5).iterator();
		Stream<Integer> stream = getStreamFromIterator(iterator);
		stream.forEach(s -> System.out.println(s));
		
		// Convert IntStream to String
		IntStream intstrem = "Geeks".chars(); // String.chars returns stream of ints 
		String string = intstrem.collect(StringBuilder:: new, 
						StringBuilder::appendCodePoint,
						StringBuilder::append)
				.toString();
		System.out.println(string);
		
		// Character Counts
		String str = "geeksforgeeks";
		char c = 'e';
		System.out.println(countCharacter(str,c));
		
		// Flatten the Stream of Arrays
		Character [] [] strArr = {
				{'A','B'},
				{'C','D'},
				{'E','F'}
		};
		Character [] strFlatArray = flattenStream(strArr).toArray(Character[]::new);
		System.out.println(Arrays.toString(strFlatArray));
		Integer [][] arr = {
				{1,2},
				{3,4,5,6},
				{7,8,9}
		};
		Integer [] flatArray = flattenStream(arr).toArray(Integer[] ::new);
		System.out.println(Arrays.toString(flatArray));*/ 
	}

	/**
	 * @return
	 */
	public static int findMinimum(int[] arr) {
		// Calculate minimum value in stream
		int min1 = Arrays.stream(arr).min().orElse(0);
		return min1;
	}

	private static <T> Stream<T> flattenMap(Collection<List<T>> values) {
		Stream<T> stream = values.stream().flatMap(x -> x.stream());
		return stream;
	}

	private static <T> Stream<T>flattenList(List<T> temp1, List<T> temp2) {
		Stream<T> stream = Stream.of(temp1,temp2).flatMap(List::stream);
		return stream;
	}

	private static <T> Stream<T> flattenmore(T [] ... arrays) {
		Stream<T> stream = Stream.of(arrays).flatMap(Arrays:: stream);
		return stream;
	}

	private static <T> Stream<T> flatten(T[] a, T[] b) {
		Stream<T> stream = Stream.of(a,b).flatMap(Arrays:: stream);
		return stream;
	}

	private static <T> Stream<T> getStreamFromIterator(Iterator<T> iterator) {
		Spliterator<T> splititerator = Spliterators.spliteratorUnknownSize(iterator, 0);
		return StreamSupport.stream(splititerator, false);
	}

	private static <T> Stream<T> flattenStream(T[][] arr) {
		List<T> list = new ArrayList<>();
		for(T[] array : arr) {
			Arrays.stream(array).forEach(list::add);
		}
		return list.stream();
	}

	/** Counts the given character occurrence in String 
	 * @param str
	 * @param ch
	 * @return
	 */
	private static long countCharacter(String str, char ch) {
		return str.chars().
				filter(c -> c == ch).count();
	}
	class Person {
		public String name;
		public String id;
		public Person(String name, String id) {
			this.name = name;
			this.id = id;
		}	
		public String getId() {
			return id;
		}
		@Override
		public String toString() {
			return "Person [name=" + name + ", id=" + id + "]";
		}
	}
}

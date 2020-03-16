import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SearchDemo {

	public static void main(String[] args) {
		
		/* Finding
		 * findFirst(), findAny()
		 * Optional<T> findFirst()
		 * Optional<T> findAny()
		 * Return type is Optional and these are considered as terminal Operations
		*/
		IntStream stream1 = IntStream.of(12,45,67,23,19,26);
		stream1.findFirst().ifPresent(System.out::println);
		
		IntStream stream2 = IntStream.of(1,4,3,2,6,7,8,9);
		stream2.findAny().ifPresent(System.out::println);
		
		// if stream is empty
		Stream<String> stream3 = Stream.empty();
		System.out.println(stream3.findAny().isPresent());
		
		// anyMatch() - returns true if any of elements matches the given predicate
		// if stream is empty or there is no matching elements this returns false
		IntStream stream4 = IntStream.of(1,2,3,4,5,7,8);
		System.out.println(stream4.anyMatch(i -> i%3 == 0));
		
		IntStream stream5 = IntStream.empty();
		System.out.println(stream5.anyMatch(i -> i%3 == 0));
		
		// allMatch() - returns true if all elements matches the given predicate
		IntStream stream6 = IntStream.of(1,2,3,4,5,6,7);
		System.out.println(stream6.allMatch(i -> i>0));
		
		IntStream stream7 = IntStream.of(1,2,4,5,7);
		System.out.println(stream7.allMatch(i -> i%3 == 0));
			
		// noneMatch() - returns true if none of elements matches the given predicate
		IntStream stream8 = IntStream.of(1,2,4,5,7);
		System.out.println(stream8.noneMatch(i -> i>0));
		
		IntStream stream9 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
		System.out.println(
		    stream9.noneMatch(i -> i%3 == 0)
		); // false

		IntStream stream10 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
		System.out.println(
		    stream10.noneMatch(i -> i > 10)
		); // true
		
		
		/*
		As you can see, first of all, operations on a stream are not evaluated sequentially 
		(in this case, first filter all the elements and then evaluate if all elements match the predicate of allMatch()).
	    Second, we can see that as soon as an element passes the filter predicate (like 2) the predicate of allMatch() is evaluated.
        Finally, we can see short-circuiting in action. As soon as the predicate of allMatch() finds an element that doesn't
        evaluate to true (like 4), the two stream operations are canceled, no further elements are processed and the result is returned.	
        Just remember:
			With some operations, the whole stream doesn't need to be processed.
			Stream operations are not performed sequentially.
		 */
		IntStream stream11 = IntStream.of(1,2,3,4,5,6,7);
		boolean b = stream11.
				filter(i -> {
					System.out.println("Filter:"+i);
					return i%2 ==0;
				})
				.allMatch(i -> {
				System.out.println("AllMatch:"+i);
				return i<3;
				});
		System.out.println(b);
		
		
		
		// Self Test
		
		IntStream stream12 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
        stream12.allMatch(i -> {
            System.out.print(i);
            return i % 3 == 0;
        });
		
        IntStream stream13 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
        stream13.filter(i -> {
                return i > 3;
        }).anyMatch(i -> {
                System.out.print(i);
                return i % 2 == 1;
        });
		
	}

}

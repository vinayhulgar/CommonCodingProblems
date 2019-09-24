import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

public class LetterCount {
	public static void main(String[] args) {
		Stream<String> words = Stream.of("calf","dog","cat","bird","Lion");
		Map<String, Long> letterToCount = 
				words.map(w -> w.split(""))
				.flatMap(Arrays::stream)
				.collect(groupingBy(identity(),counting()));
		
		Set<String> sample = letterToCount.keySet();
		Set<Map.Entry<String, Long>> sample2 = letterToCount.entrySet();
		for(String s : sample){
			System.out.println(s);
		}
		for(Map.Entry<String, Long> s1 : sample2){
			System.out.println(s1);
		}
	}
}

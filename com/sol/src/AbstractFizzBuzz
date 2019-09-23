import java.util.ArrayList;
import java.util.List;

/**
 * Abstraction with FizzBuzz
 */
public class AbstractFizzBuzz {
	private static final int MAX = 30;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> output = new ArrayList<>();
		output = alternativeFizzBuzz();
		for (String itr : output) {
			System.out.println(itr);
		}
	}
	public static List<String> alternativeFizzBuzz() {
		final List<String> toReturn = new ArrayList<>();
		for(int i=1;i<=MAX;i++){
			final String word = toWord(3,i,"Fizz")+toWord(5,i,"Buzz");
			if(word.equals("")){
				toReturn.add(Integer.toString(i));
			}
			else{
				toReturn.add(word);
			}
		}
		return toReturn;
	}
	private static String toWord(final int divisor, final int Value, final String word) {
		return Value % divisor==0 ? word : "";
	}
}

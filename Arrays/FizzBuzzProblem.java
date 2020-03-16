/**
 * Prints all numbers from 1 - n replacing multiples of 3 with String with "Fizz", 
 * multiples of 5 with String "Buzz" and multiples of 15 with String "FizzBuzz"
 */
public class FizzBuzzProblem {
	private static int n_MAX = 30;
	public static void main(String[] args) {
		for(int i=1;i<=n_MAX;i++){
			if(i%15==0){
				System.out.println("FizzBuzz");
			}
			else if(i%5==0){
				System.out.println("Buzz");
			}
			else if(i%3==0 ){
				System.out.println("Fizz");
			}
			else{
				System.out.println(""+i);
			}
		}
	}

}

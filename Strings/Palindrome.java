public class Palindrome {
	
	
	
	public static boolean isPalindrome(String text) {
		String reversedtext = reverse(text);
		if(text.equals(reversedtext)) {
			return true;
		}
		return false;
	}

	private static String reverse(String text) {
		StringBuilder sb = new StringBuilder(text).reverse();
		return sb.toString();
	}
	public static void main(String[] args) {
		/*
			// Using Stack
		System.out.println("Enter any String:");
		Scanner input = new Scanner(System.in);
		String inputstring = input.nextLine();
		Stack<Character> stack = new Stack();
		for(int i=0; i<inputstring.length();i++){
			stack.push(inputstring.charAt(i));
		}
		String reversestring="";
		while(!stack.isEmpty()){
			reversestring = reversestring+stack.pop();
		}
		if(inputstring.equals(reversestring)){
			System.out.println("The input string is palindrome");
		}
		else
			System.out.println("The input String is not Palindrome ");*/
		
		// Using Queue
		/*System.out.println("Enter any String:");
		Scanner input = new Scanner(System.in);
		String inputstring = input.nextLine();
		Queue queue = new LinkedList<>();
		
		for(int i=inputstring.length()-1;i>=0;i--){
			queue.add(inputstring.charAt(i));
		}
		String reversestring="";
		
		while(!queue.isEmpty()){
			reversestring = reversestring+queue.remove();
		}
		if(inputstring.equals(reversestring)){
			System.out.println("The input string is palindrome");
		}
		else
			System.out.println("The input String is not Palindrome ");*/
		
		
		// Using Loops
		System.out.println("Enter any String:");
		Scanner input = new Scanner(System.in);
		String inputstring = input.nextLine();
		
		String reverseString="";
		for(int i =inputstring.length()-1;i>=0;i--){
			reverseString = reverseString+inputstring.charAt(i);
		}
		if(inputstring.equals(reverseString)){
			System.out.println("The input string is palindrome");
		}
		else
			System.out.println("The input String is not Palindrome ");
		
		
		
		
		
		
	}
}

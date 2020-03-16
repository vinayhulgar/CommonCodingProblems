public class LambdaAsArgumentDemo {
	// This method has a functional interface as a type of its 
	// first parameter. Thus it can be passed a reference to 
	// any instance of that interface, including the instance created
	// by lambda expression.
	// The second parameter specifies the string to operate on.
	static String stringOp(StringFunc sf, String s){
		return sf.func(s);
	}
	public static void main(String[] args) {
		String inStr ="Lambdas add power to Java";
		String outStr;
		System.out.println("Here is input string "+inStr);
		// Here a simple expression lambda that uppercases a string is passed to stringOp()
		outStr = stringOp((str) -> str.toUpperCase(), inStr);
		System.out.println("The String in UpperCase"+outStr);
		// This passes a block of lambda that removes spaces.
		outStr = stringOp((str) -> {
			String result ="";
			int i;
			for(i=0;i<str.length();i++)
				if(str.charAt(i) != ' ')
					result += str.charAt(i);
			return result;
		}, inStr);
		System.out.println("the String with spaces removed"+ outStr);
		// It is possible to pass a StringFunc instance  created by an earlier lambda expression.
		StringFunc reverse = (str) -> {
			String result ="";	
			int i;
			for(i=str.length()-1; i>=0;i--)
				 result +=str.charAt(i);
			return result;
		};
		// Now reverse can be passed as first parameter to stringOp() since it refers to StringFunc object.
		System.out.println("The String reversed: "+stringOp(reverse, inStr));	
	}
}

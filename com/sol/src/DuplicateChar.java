import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Write an Algorithm to remove duplicate chars in a string.
 * 1. For each character, check if there is a duplicate 
 * 2. replace the duplicate character 
 * Without using any additional buffer.
 * One or two additional variable is fine.
 * An extra copy of array is not.
 * Write TestCases for this method.
 * 1. String does not contain any duplicates "abcd"
 * 2. String contains all duplicates "aaaaa"
 * 3. Null String
 * 4. String with all continuous duplicates eg: "aaabbb"
 */
public class DuplicateChar {
	public static void main(String[] args) {
		String input = "AHSGTREOA";
		//String output  = duplicateChar(input);
		//System.out.println(output);
		DuplicateChar test1 = new DuplicateChar();
		test1.testDuplicateChar();
		
	}

	private static String duplicateChar(String input) {
		for(int i=0;i<input.length();i++){
			char check = input.charAt(i);
			for(int j=i+1;j<input.length();j++){
				char temp = input.charAt(j);
				if(check == temp){
					input = input.replace(temp, ' ');
				}
			}
		}
		
		return input; 
	}
	
	@Test
	public void testDuplicateChar(){
		String result = duplicateChar("AHSGTREOA").trim();
		assertEquals("HSGTREO",result);
	}
	
	@Test
	public void testAllDup(){
		String result = duplicateChar("AAAA").trim();
		assertEquals("",result);
	}
	
	@Test
	public void testNoDup(){
		String result = duplicateChar("ABCD").trim();
		assertEquals("ABCD",result);
	}
	
	@Test
	public void testNullString(){
		String result = duplicateChar("").trim();
		assertEquals("",result);
	}
	
	@Test
	public void testContinuousDup(){
		String result = duplicateChar("AAABBB").trim();
		assertEquals("",result);
	}
}

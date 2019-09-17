/**
 * CCI Solution
 * Time complexity: O(n)
 * Space Complexity: O(n)
 * where n is length of string
 */
public class UniqueCharSol {
	public static void main(String[] args) {
		String str = "GKAHFTSTIOB";
		boolean output = isUniqueChars(str);
		if(!output){
			System.out.println("String Doesn't contain unique characters");
		}
		else{
			System.out.println("String contain unique characters");
		}
		// Reducing space Using Bit Vector
		// Assuming all chars are in lower case.
		boolean output_bitvector = isUniqueCharsBitVector(str);
		if(!output_bitvector){
			System.out.println("String Doesn't contain unique characters");
		}
		else{
			System.out.println("String contain unique characters");
		}
		
	}
	private static boolean isUniqueCharsBitVector(String str) {
		int checker =0;
		for(int i=0;i<str.length();++i){
			int val = str.charAt(i) - 'a';
			if((checker & (1 << val)) > 0)
				return false;
			checker |= (1 << val);
		}
		return true;
	}
	private static boolean isUniqueChars(String str) {
		boolean [] char_set = new boolean[256];
		for(int i=0;i<str.length();i++){
			int val = str.charAt(i);
			if(char_set[val])
				return false;
			char_set[val] = true;
		}
		return true;
	}
}

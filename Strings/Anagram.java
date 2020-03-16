import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/*
	Anagram : Two strings are set to be anagram if either one of them
	are created by other
	
	 Sort the strings
	 compare both

*/
public class Anagram {

	
	public static boolean isValid(String text, String anagram) {
		text = prepare(text);
		anagram = prepare(anagram);
		
		String sortedtext = sort(text);
		String sortedAnagram = sort(anagram);
		return sortedtext.equals(sortedAnagram);
	}
	
	private static String sort(String text) {
		char [] chars = prepare(text).toCharArray();
		Arrays.sort(chars);
		return new String (chars);
	}
	
	private static String prepare(String text) {
		return text.toLowerCase().trim().replaceAll("\\s", "");
	}
	
	// Old Way
	@SuppressWarnings("unused")
	public static void checkAnagram(String s1, String s2) {
		String sorteds1 = sortString (s1);
		String sorteds2 = sortString (s2);
		
		int isequal = compareTo(sorteds1, sorteds2);
		if(isequal == 0) {
			System.out.println("Two Strings are Anagram");
		}
	}


	/**
	 * @param str
	 * @return
	 */
	private static String sortString(String str) {
		Set<Character> set1 = new TreeSet<>();
		StringBuilder sb = new StringBuilder();
		char [] d = str.toCharArray();
		for(int i=0; i<d.length;i++) {
			set1.add(d[i]);
		}
		for(char c : set1) {
			sb.append(c);
		}
		return sb.toString();
	}

	/**
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static int compareTo(String str1, String str2) {
		if(str1.equals(str2)) {
			return 0;
		}
		return -1;
	}

}

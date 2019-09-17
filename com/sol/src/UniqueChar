**
 * Program to check if a string has all unique characters without
 * using any additional DS.
 * Time Complexity: O(n2)
 * Space Complexity: No
 * 
 */
public class UniqueChar {
	public static void main(String[] args) {
		String input = "GKAHFTSLIOB";
		boolean unique = true;
		for(int i=0;i<input.length();i++){
			char check = input.charAt(i);
			for(int j=i+1;j<input.length();j++){
				char temp = input.charAt(j);
				if(check == temp){
					unique = false;
					break;
				}
			}
		}
		if(!unique){
			System.out.println("String Doesn't contain unique characters");
		}
		else{
			System.out.println("String contain unique characters");
		}
	}
}

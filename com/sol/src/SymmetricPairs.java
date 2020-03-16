import java.util.HashMap;
/**
 * Program to find all symmetric pairs in a given array of pairs 
 */
public class SymmetricPairs {
	public static void main(String[] args) {
		int arr[][] = new int[5][2];
		arr[0][0] = 11;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		arr[2][0] = 5;
		arr[2][1] = 10;
		arr[3][0] = 40;
		arr[3][1] = 30;
		arr[4][0] = 10;
		arr[4][1] = 5;
		findsymmetry(arr);
	}
	private static void findsymmetry(int[][] arr) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			int first = arr[i][0];
			int sec = arr[i][1];
			Integer val = hm.get(sec);
			if(val!=null && val == first){
				System.out.println("Symmetric Pair: "+"(" + sec +","+first+")");
			}
			else{
				hm.put(first, sec);
			}
		}
	}
}

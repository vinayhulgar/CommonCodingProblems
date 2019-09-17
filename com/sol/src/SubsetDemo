import java.util.Hashtable;

/**
 * To find whether given array arr2[] is subset of 
 * another array arr1[]using Hashing
 * Create a hashtable for all elements of arr1[]
 * Traverse arr2[] and search each element of arr2[] in hashtable.
 * If found return 1 else return 0. 
 */
public class Subset {
	public static void main(String[] args) {
		boolean subset = false;
		int arr1[] = {10,5,2,23,19};
		int arr2[] = {19,5,3};
		Hashtable<Integer, Integer> temphash = new Hashtable<>();
		for(int i=0;i<arr1.length;i++){
			temphash.put(i, arr1[i]);
		}
		for(int j=arr2.length-1;j>0;j--){
			int temp = arr2[j];
			if(!temphash.containsValue(temp)){
				subset = false;
				break;
			}
			else{
				subset = true;
			}
		}
		System.out.println("Is arr2 subset of arr1? "+subset);
	}
}

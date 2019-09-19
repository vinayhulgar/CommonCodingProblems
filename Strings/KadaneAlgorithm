
/**
 * Find the largest sum of continuous sub array given an array of 
 * integers(positive or negative) 
 * 
 * psudeoCode:
 * if 
 *
 */
public class KadaneAlgorithm {

	public static void main(String[] args) {
		int arr[] = { 1, 8, -3, -7, 2, 7, -1, 9 };
		System.out.println("Maximum subarray is  " + kandaneForMaxSubArray(arr));
	}

	private static int kandaneForMaxSubArray(int[] arr) {
		int maxEndHere = 0;
		  int maxSoFar = 0;
		  for (int i = 0; i < arr.length; i++) {
		   maxEndHere += arr[i];
		   if (maxEndHere < 0) {
		    maxEndHere = 0;
		   }
		   if (maxSoFar < maxEndHere) {
		    maxSoFar = maxEndHere;
		   }
		  }
		  return maxSoFar;
	}

}

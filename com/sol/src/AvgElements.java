/**
 * Program to find average of elements in array
 */
public class AverageElements {
	public static void main(String[] args) {
		int [] temp = {2,4,5,8,12,45,9,41};
		int avg = 0;
		int elements = temp.length;
		for(int i=0;i<elements;i++){
			avg +=temp[i];
		}
		System.out.println("Avg number is"+avg/elements);
	}
}

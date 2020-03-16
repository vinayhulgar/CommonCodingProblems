
/**
 * psuedoCode:for i between 0 and (array length -2);
 * if(array(i+1)<array(i))
 * switch array(i) and array(i+1)
 * repeat until a complete iteration when no elements are switched.
 */
public class BubbleSortDemo {
	public static void main(String[] args) {
		int [] input = {33,42,56,12,8,76,342,98,3};
		int [] output = bubbleSort(input);
		System.out.println("Sorted Array:");
		for(int j=0; j<output.length;j++)
			System.out.println(output[j]);
	}
	private static int[] bubbleSort(int[] input) {
		boolean numbersSwitched;
		do{
			numbersSwitched = false;
			for(int i =0; i<input.length-1;i++){
				if(input[i+1]<input[i]){
					int tmp = input[i+1];
					input[i+1] = input[i];
					input[i] = tmp;
					numbersSwitched = true;
				}
			}
		}
		while(numbersSwitched);
		return input;
	}
}

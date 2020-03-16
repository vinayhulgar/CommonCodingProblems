/*
Task
Given an array, , of  integers, calculate and print the respective mean, median, and mode on separate lines. 
If your array contains more than one modal value, choose the numerically smallest one.

Note: Other than the modal value (which will always be an integer), your answers should be in decimal form, 
rounded to a scale of  decimal place (i.e., ,  format).

Input Format

The first line contains an integer, , denoting the number of elements in the array.
The second line contains  space-separated integers describing the array's elements.

Constraints

, where  is the  element of the array.
Output Format

Print  lines of output in the following order:

Print the mean on a new line, to a scale of  decimal place (i.e., , ).
Print the median on a new line, to a scale of  decimal place (i.e., , ).
Print the mode on a new line; if more than one such value exists, print the numerically smallest one.

Explanation

Mean:
We sum all  elements in the array, divide the sum by , and print our result on a new line.

Median:
To calculate the median, we need the elements of the array to be sorted in either non-increasing or non-decreasing order. The sorted array . We then average the two middle elements:

and print our result on a new line.
Mode:
We can find the number of occurrences of all the elements in the array:

 4978 : 1
11735 : 1
14216 : 1
14470 : 1
38120 : 1
51135 : 1
64630 : 1
67060 : 1
73429 : 1
99233 : 1
Every number occurs once, making  the maximum number of occurrences for any number in . Because we have multiple values to choose from, we want to select the smallest one, , and print it on a new line.

*/
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

// Time Complexity: O(n log n) due to sorting
public class MeanmedienModeImpl {
    public static void main(String[] args) {
        /* Save input */
       // Scanner scan = new Scanner(System.in);
        //int size = scan.nextInt();
        //int [] array = new int[size];
        //for (int i = 0; i < size; i++) {
         //   array[i] = scan.nextInt();
       // }
       // scan.close();
       
       int [] array = {1,45,21,78,23,66,98,21, 45};
       int size = array.length;

        /* Sort array: O(n log n) runtime */
        Arrays.sort(array);
        
        /* Calculate Mean */
        int total = 0;
        for (int num : array) {
            total += num;
        }
        double mean = (double) total / size;
        
        /* Calculate Median */
        double median;
        if (size % 2 == 0) {
            median = (array[size / 2 - 1] + array[size / 2]) / 2.0;
        } else {
            median = array[size / 2];
        }
        
        /* Calculate Mode - if there's a tie, choose the smaller number */
        HashMap<Integer, Integer> map = new HashMap();
        int maxOccurrences = 0;
        int mode = Integer.MAX_VALUE;
        for (int num : array) {
            map.merge(num, 1, Integer::sum);
            int occurrences = map.get(num);
            if (occurrences > maxOccurrences || (occurrences == maxOccurrences && num < mode)) {
                maxOccurrences = occurrences;
                mode = num;
            }
        }

        /* Print results */
        System.out.println("Mean: "+mean);
        System.out.println("Median: "+median);
        System.out.println("Mode: "+mode);
    }
}
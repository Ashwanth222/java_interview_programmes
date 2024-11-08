package Leetcode;

import java.util.Arrays;
import java.util.Comparator;

//You are given an integer num. You can swap two digits at most once to get the maximum valued number.
//
//Return the maximum valued number you can get.
//
//
//Example 1:
//
//Input: num = 2736
//Output: 7236
//Explanation: Swap the number 2 and the number 7.
//Example 2:
//
//Input: num = 9973
//Output: 9973
//Explanation: No swap.
public class MaximumSwap {
    public static void main(String[] args) {

        int num = 2736;
        // Convert number to string for digit manipulation
        char[] numArr = Integer.toString(num).toCharArray();
        int n = numArr.length;

        // Track the last occurrence of each digit (0-9)
        int[] last = new int[10];
        System.out.println("last" + Arrays.toString(last));
        for (int i = 0; i < n; i++) {
            last[numArr[i] - '0'] = i;
        }
        System.out.println(Arrays.toString(last));

        // Traverse the number from left to right
        for (int i = 0; i < n; i++) {
            // Check if we can find a larger digit to swap
            for (int d = 9; d > numArr[i] - '0'; d--) {
                if (last[d] > i) {
                    // Swap and return the new number
                    char temp = numArr[i];
                    numArr[i] = numArr[last[d]];
                    numArr[last[d]] = temp;
                    Integer.parseInt(new String(numArr));
                }
            }
        }
        System.out.println(Arrays.toString(numArr));

        // Return the original number if no swap occurred
        System.out.println(num);

    }
}

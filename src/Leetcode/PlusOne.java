package Leetcode;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

//8.8K
//5.3K
//Companies
//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//
//Increment the large integer by one and return the resulting array of digits.
//
//
//
//Example 1:
//
//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].
//Example 2:
//
//Input: digits = [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.
//Incrementing by one gives 4321 + 1 = 4322.
//Thus, the result should be [4,3,2,2].
//Example 3:
//
//Input: digits = [9]
//Output: [1,0]
//Explanation: The array represents the integer 9.
//Incrementing by one gives 9 + 1 = 10.
//Thus, the result should be [1,0].
public class PlusOne {
    public static void main(String[] args) {
       // int[] a = {4, 3, 2, 2};
        int[] a = {4, 3, 2, 9};
        int[] b = null;
        if (a[a.length - 1] == 9) {
            b = new int[a.length + 1];
            for (int j = 0; j < a.length; j++) {
                if (j != a.length - 1) {
                    b[j] = a[j];
                } else {
                    if (a[j] == 9) {
                        b[j] = 1;
                        b[j + 1] = 0;
                    } else {
                        b[j] = a[j] + 1;
                    }
                }
            }
        } else {
            b = new int[a.length];
            for (int j = 0; j < a.length; j++) {
                if (j != a.length - 1) {
                    b[j] = a[j];
                } else {
                    b[j] = a[j] + 1;
                }
            }
        }

        System.out.println(Arrays.toString(b));

        //alternate

    }
}

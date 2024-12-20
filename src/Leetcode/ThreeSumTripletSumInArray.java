package Leetcode;

import java.util.HashSet;
import java.util.Set;

//Given an array arr[] of size n and an integer sum. Find if there’s a triplet in the array which sums up to the given integer sum.
//
//Examples:
//
//Input: arr = {12, 3, 4, 1, 6, 9}, sum = 24;
//Output: 12, 3, 9
//Explanation: There is a triplet (12, 3 and 9) present
//in the array whose sum is 24.
//
//
//Input: arr = {1, 2, 3, 4, 5}, sum = 9
//Output: 5, 3, 1
//Explanation: There is a triplet (5, 3 and 1) present
//in the array whose sum is 9.
//
//
//Input: arr = {2, 10, 12, 4, 8}, sum = 9
//Output: No Triplet
//Explanation: We do not print in this case and return false.
public class ThreeSumTripletSumInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 9;
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i + 1; j < arr.length-1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        System.out.println(arr[i] + "+" + arr[j] + "+" + arr[k]);
                    }
                }
            }
        }

        //alternate
        int[] arr1 = {1, 4, 45, 6, 10, 8};
        int sum1 = 22;
        int n = arr1.length;

        // Fix the first element as arr[i]
        for (int i = 0; i < n - 2; i++) {

            // Create a set to store potential second
            // elements that complement the desired sum
            Set<Integer> s = new HashSet<>();

            // Calculate the current sum needed to reach the
            // target sum
            int curr_sum = sum1 - arr1[i];

            // Iterate through the subarray arr[i+1..n-1] to
            // find a pair with the required sum
            for (int j = i + 1; j < n; j++) {

                // Calculate the required value for the
                // second element
                int required_value = curr_sum - arr1[j];

                // Check if the required value is present in
                // the set
                if (s.contains(required_value)) {

                    // Triplet is found; print the triplet
                    // elements
                    System.out.println(
                            "Triplet is " + arr1[i] + ", "
                                    + arr1[j] + ", " + required_value);
                    // return true;
                }

                // Add the current element to the set for
                // future complement checks
                s.add(arr1[j]);
            }
        }

        // If no triplet is found, return false
        //return false;
        int l = 10;
        {
            // first loop
            for (int i = 1; i < l; i++) {

                // check for 1st number
                if (i % 3 != 0) {

                    // second loop
                    for (int j = 1; j < l; j++) {

                        // check for 2nd number
                        if (j % 3 != 0) {

                            // third loop
                            for (int k = 1; k < l; k++) {

                                // Check for 3rd number
                                if (k % 3 != 0 && (i + j + k) == n) {
                                    System.out.println(i + " " +
                                            j + " " + k);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
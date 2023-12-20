package Leetcode;

import java.util.Arrays;

//Example 1:
//
//Input: nums = [1,7,3,6,5,6]
//Output: 3
//Explanation:
//The pivot index is 3.
//Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
//Right sum = nums[4] + nums[5] = 5 + 6 = 11
//Example 2:
//
//Input: nums = [1,2,3]
//Output: -1
//Explanation:
//There is no index that satisfies the conditions in the problem statement.
//Example 3:
//
//Input: nums = [2,1,-1]
//Output: 0
//Explanation:
//The pivot index is 0.
//Left sum = 0 (no elements to the left of index 0)
//Right sum = nums[1] + nums[2] = 1 + -1 = 0
//
public class FindThePivoteElement {
    public static void main(String[] args){
        int[] arr = {1,7,3,6,5,6};
        for(int i = 0; i<=arr.length-1;i++){
            int leftSum =  Arrays.stream(arr).limit(i).sum();
            for(int j = i+2; j<=arr.length-1;j++){
                int rightSum =    Arrays.stream(arr).skip(j-1).sum();
                if(leftSum == rightSum){
                    System.out.println(j-2 +" is the mid point"+ " " +
                            " from this mid point left side  and right side numbers are equal");
                }
            }
        }
        //alternate method

        // // Initialize total sum of the given array...
        //        int totalSum = 0;
        //        // Initialize 'leftsum' as sum of first i numbers, not including nums[i]...
        //        int leftsum = 0;
        //        // Traverse the elements and add them to store the totalSum...
        //        for (int ele : nums)
        //            totalSum += ele;
        //        // Again traverse all the elements through the for loop and store the sum of i numbers from left to right...
        //        for (int i = 0; i < nums.length; leftsum += nums[i++])
        //            // sum to the left == leftsum.
        //            // sum to the right === totalSum - leftsum - nums[i]..
        //            // check if leftsum == totalSum - leftsum - nums[i]...
        //            if (leftsum * 2 == totalSum - nums[i])
        //                return i;       // Return the pivot index...
        //        return -1;      // If there is no index that satisfies the conditions in the problem statement...
    }
}

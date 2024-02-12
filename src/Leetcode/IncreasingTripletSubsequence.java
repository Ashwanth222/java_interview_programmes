package Leetcode;
//Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,4,5]
//Output: true
//Explanation: Any triplet where i < j < k is valid.
//Example 2:
//
//Input: nums = [5,4,3,2,1]
//Output: false
//Explanation: No triplet exists.
//Example 3:
//
//Input: nums = [2,1,5,0,4,6]
//Output: true
//Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
public class IncreasingTripletSubsequence {
    public static void main(String[] args){
        int[] arr = {2,1,5,0,4,6};
        int count = 0;
        for(int i = 0; i<arr.length-2;i++){
            if(arr[i] <arr[i+1]&&arr[i+1]<arr[i+2]){
                System.out.println(true);
                count = count+1;
                break;
            }
        }
        if(count ==0){
            System.out.println(false);
        }

        //alternate
        int[] nums = {2,1,5,0,4,6};

        if (nums == null || nums.length < 3) {
            System.out.println(false);
        }
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        boolean flag = false;
        for (int num : nums) {
            if (num <= a) {
                a = num;
            } else if (num <= b) {
                b = num;
            } else {
                flag = true;
                 System.out.println(flag);
            }
        }

        if(!flag) {
            System.out.println(flag);
        }
    }
}

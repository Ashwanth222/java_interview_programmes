package Leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

//35. Search Insert Position
//Easy
//15.5K
//685
//Companies
//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//
//You must write an algorithm with O(log n) runtime complexity.
//
//
//
//Example 1:
//
//Input: nums = [1,3,5,6], target = 5
//Output: 2
//Example 2:
//
//Input: nums = [1,3,5,6], target = 2
//Output: 1
//Example 3:
//
//Input: nums = [1,3,5,6], target = 7
//Output: 4
public class InsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6, 7, 9};
        int target = 8;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >target || nums[i] == target){
                System.out.println(i);
                break;
            }
//            while (Arrays.stream(nums).boxed().collect(Collectors.toList())
//                    .listIterator().hasNext()) {
//                if(Arrays.stream(nums).boxed().collect(Collectors.toList())
//                        .listIterator().next()>nums[i]){
//                    System.out.println(i);
//                    break;
//                }
//            }
        }
    }
}

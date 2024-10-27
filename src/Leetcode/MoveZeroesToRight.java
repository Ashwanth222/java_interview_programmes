package Leetcode;

//283. Move Zeroes


//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//Note that you must do this in-place without making a copy of the array.
//
//
//
//Example 1:
//
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
//Example 2:
//
//Input: nums = [0]
//Output: [0]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MoveZeroesToRight {
    public static void main(String[] args){
       int[] nums = {0,1,0,3,12};
       int[] num1 = new int[nums.length];
       int j = 0;
       int count = 0;
       for(int i = 0; i<nums.length;i++){
           if(nums[i] != 0){
               num1[j] = nums[i];
               j++;
           }else {
               count = count+ 1;
           }
       }
       System.out.println(Arrays.toString(num1));
       System.out.println(Arrays.toString(nums));
       System.out.println(count);

       //alternate
        int[] nums1 = {0,1,0,3,12};
        int temp = 0;
        for(int i = 1; i<nums.length;i++){
            for(int jj = i; jj<nums.length;jj++) {
                if (nums1[jj - 1] == 0) {
                    temp = nums1[jj - 1];
                    nums1[jj- 1] = nums1[jj];
                    nums1[jj] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(nums1));

        //alternate
        int[] nums3 = {0,1,0,3,12};
        List<Integer> integerList = new ArrayList<>();
        Arrays.stream(nums3).boxed().filter(i -> i !=0).forEach( e -> integerList.add(e));
        Arrays.stream(nums3).boxed().filter(i -> i ==0).forEach( e -> integerList.add(e));
        System.out.println("integerList  " + integerList);

    }
}

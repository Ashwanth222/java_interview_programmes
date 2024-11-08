package Leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

//Single Number
//Easy
//15.9K
//667
//Companies
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
//You must implement a solution with a linear runtime complexity and use only constant extra space.
//
//
//
//Example 1:
//
//Input: nums = [2,2,1]
//Output: 1
//Example 2:
//
//Input: nums = [4,1,2,1,2]
//Output: 4
//Example 3:
//
//Input: nums = [1]
//Output: 1
public class FindNonRepeatedElementInArray {
    public static void main(String[] args){
       int[] nums = {4,1,2,6,1,2,4};
        Map<Integer,Long> map = Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(e->e,Collectors.counting()));
       int unique = map.entrySet().stream().filter(e-> e.getValue() ==1).findFirst().get().getKey();
       System.out.println(unique);
    }
}

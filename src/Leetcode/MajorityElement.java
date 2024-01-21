package Leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

//Majority Element
//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//
//
//
//Example 1:
//
//Input: nums = [3,2,3]
//Output: 3
//Example 2:
//
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2
public class MajorityElement {
    public static void main(String[] args){
       //int[] nums = {3,2,3};
        int[] nums = {2,2,1,1,1,1,2,2,2};
      Map<Integer, Long> map = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(e->e,Collectors.counting()));
      int majority = map.entrySet().stream().sorted((e1,e2) -> Math.toIntExact(e2.getValue() - e1.getValue())).findFirst().get().getKey();
      System.out.println(majority);
    }
}

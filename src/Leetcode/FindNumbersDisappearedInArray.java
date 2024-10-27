package Leetcode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Given an array nums of n integers where nums[i] is in the range [1, n],
// return an array of all the integers in the range [1, n] that do not appear in nums.
//
//
//
//Example 1:
//
//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [5,6]
//Example 2:
//
//Input: nums = [1,1]
//Output: [2]
public class FindNumbersDisappearedInArray {
    public static void main(String[] args){
       int[] nums = {4,3,2,8,2,3,1};
       int max = Arrays.stream(nums).max().getAsInt();
       int min = Arrays.stream(nums).min().getAsInt();
       Arrays.sort(nums);
       List<Integer> list = new ArrayList<>();
       for(int i = min; i<=max; i++){
           list.add(i);
       }
       Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
       for(int i = 0; i<list.size();i++){
           if(!set.contains(list.get(i))){
                System.out.println(list.get(i));
           }
       }

       //alternate
        int max1 = Arrays.stream(nums).max().getAsInt();
        int min1 = Arrays.stream(nums).min().getAsInt();


       //alternate
        List<Integer> integerList = new LinkedList<>();
        IntStream.range(min, max).boxed().forEach(e -> integerList.add(e));
        System.out.println(integerList);

        List<Integer> disappered = integerList
                .stream()
                .filter(l -> !set.contains(l)).collect(Collectors.toList());
        System.out.println(disappered);
    }
}

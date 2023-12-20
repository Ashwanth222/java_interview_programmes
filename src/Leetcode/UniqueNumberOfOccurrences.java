package Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

//Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
//
//
//
//Example 1:
//
//Input: arr = [1,2,2,1,1,3]
//Output: true
//Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
//Example 2:
//
//Input: arr = [1,2]
//Output: false
//Example 3:
//
//Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
//Output: true
public class UniqueNumberOfOccurrences {
    public static void main(String[] args){
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0,0};
        Map<Integer,Integer> cha = new HashMap<>();
        for(int ar: arr){
            if(cha.containsKey(ar)){
                cha.put(ar,cha.get(ar)+1);
            }else{
                cha.put(ar,1);
            }
        }
        System.out.println(cha);
        int l = cha.values().stream().toList().size();
       //Integer l = cha.entrySet().stream().map(e ->e.getValue()).collect(Collectors.toList()).size();
       System.out.println("l list size" + l);
       int k = new HashSet<>(cha.values()).size();
        //int k = cha.entrySet().stream().map(e ->e.getValue()).collect(Collectors.toSet()).size();
        System.out.println("k set size" + k);
        String s = (int) l == (int) k ? "unique" : "not unique";
        System.out.println(s);

        //  HashMap<Integer, Integer> nums = new HashMap<>();
        //        for (int j : arr) {
        //            if (nums.containsValue(j)) continue;
        //            int count = 0;
        //            for (int k : arr)
        //                if (j == k)
        //                    count++;
        //            if (nums.containsKey(count))
        //                return false;
        //            else nums.put(count, j);
        //        }
        //        return true;
    }
}

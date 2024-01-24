package Leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Example 1:
//
//Input: gain = [-5,1,5,0,-7]
//Output: 1
//Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
//Example 2:
//
//Input: gain = [-4,-3,-2,-1,4,3,2]
//Output: 0
//Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.
public class FindTheHighestAltitude {
    public static void main(String[] args){
        //int[] input = {-4,-3,-2,-1,4,3,2};
        int[] input = {-5,1,5,0,-7};
        List<Integer> integers = new ArrayList<>();
        integers.add(0);
        for(int i = 0; i<input.length;i++) {
            integers.add(integers.get(i) + input[i]);
        }
        System.out.println("integers: " + integers);
        Integer highestValue = integers.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println("highestValue: " + highestValue);
    }
}

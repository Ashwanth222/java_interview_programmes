package Leetcode;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Given two arrays of strings list1 and list2, find the common strings with the least index sum.
//
//A common string is a string that appeared in both list1 and list2.
//
//A common string with the least index sum is a common string such that if it appeared at list1[i] and list2[j] then i + j should be the minimum value among all the other common strings.
//
//Return all the common strings with the least index sum. Return the answer in any order.
//
//
//
//Example 1:
//
//Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"],
// list2 = ["Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"]
//Output: ["Shogun"]
//Explanation: The only common string is "Shogun".
//Example 2:
//
//Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"],
// list2 = ["KFC","Shogun","Burger King"]
//Output: ["Shogun"]
//Explanation: The common string with the least index sum is "Shogun" with index sum = (0 + 1) = 1.
//Example 3:
//
//Input: list1 = ["happy","sad","good"],
// list2 = ["sad","happy","good"]
//Output: ["sad","happy"]
//Explanation: There are three common strings:
//"happy" with index sum = (0 + 1) = 1.
//"sad" with index sum = (1 + 0) = 1.
//"good" with index sum = (2 + 2) = 4.
//The strings with the least index sum are "sad" and "happy".
public class MinimumIndexSumofTwoLists {
    public static void main(String[] args){
       String[] list1 = {"Shogun1","Shogun","Tapioca Express","Burger King","KFC"};
       String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        List<String> l1 = Arrays.stream(list1).toList();
        List<String> l2 = Arrays.stream(list2).toList();
        int min = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();
        int index = 0;
        for(int i=0;i<l1.size();i++){
            if(l2.contains(l1.get(i))){
                int k = l2.indexOf(l1.get(i)) + i;
                if(k<min){
                    min = k;
                 //   index = i;
                }
//                else if(k == min){
//                    result.add(l1.get(index));
//                    result.add(l1.get(i));
//                }
            }
        }
        System.out.println("min: "+min);
//        if(result.size()==0){
//            String[] a = new String[1];
//            a[0] = l1.get(index);
//            System.out.println(a);
//        }else{
//            Set<String> values = new HashSet<>(result);
//            String[] array = values.stream()
//                    .toArray(String[]::new);
//            System.out.println(Arrays.toString(array));
//        }


    }
}

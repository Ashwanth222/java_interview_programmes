package Leetcode;

import java.util.*;
import java.util.stream.Collectors;

//A distinct string is a string that is present only once in an array.
//
//Given an array of strings arr, and an integer k, return the kth distinct string present in arr.
// If there are fewer than k distinct strings, return an empty string "".
//
//Note that the strings are considered in the order in which they appear in the array.
//
//
//
//Example 1:
//
//Input: arr = ["d","b","c","b","c","a"], k = 2
//Output: "a"
//Explanation:
//The only distinct strings in arr are "d" and "a".
//"d" appears 1st, so it is the 1st distinct string.
//"a" appears 2nd, so it is the 2nd distinct string.
//Since k == 2, "a" is returned.
//Example 2:
//
//Input: arr = ["aaa","aa","a"], k = 1
//Output: "aaa"
//Explanation:
//All strings in arr are distinct, so the 1st string "aaa" is returned.
//Example 3:
//
//Input: arr = ["a","b","a"], k = 3
//Output: ""
//Explanation:
//The only distinct string is "b". Since there are fewer than 3 distinct strings,
// we return an empty string "".
public class KthDistinctStringInAnArray {
    public static void main(String[] args) {

        String[] arr1 = {"aaa", "aa", "a"};
        int k1 = 1;
        String[] arr2 = {"d", "b", "c", "b", "c", "a"};
        int k2 = 2;
        String[] arr = {"a", "b", "a"};
        int k = 3;
        Map<String, Integer> count = new HashMap<>();

        // Create a List to store distinct strings
        List<String> distinct = new ArrayList<>();

        // Loop through each string in the array
        for (String str : arr) {
            // Increment the count for each string
            count.put(str, count.getOrDefault(str, 0) + 1);
        }

        // Loop through each string in the array again to collect distinct strings
        for (String str : arr) {
            // If the string appears only once, add it to the distinct list
            if (count.get(str) == 1) {
                distinct.add(str);
            }
        }

        // Check if the k-th distinct string exists
        if (k <= distinct.size()) {
            // Return the k-th distinct string (1-based index)
            System.out.println(distinct.get(k - 1));
        } else {
            // If there are fewer than k distinct strings, return an empty string
            System.out.println("no value present");
        }

        //alternate

        Optional
                <java.util.Map.Entry<java.lang.String, java.lang.Long>> optional = Arrays.stream(arr1)
                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .limit(k1)
                .skip(k1 - 1)
                .findFirst();

        String str = "";
        if (optional.isPresent()) {
            str = optional.get().getKey();
        } else {
            System.out.println("no value present");
        }
        System.out.println(str);

        //alternate

        String str1 = Arrays.stream(arr2)
                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .limit(k)
                .skip(k2 - 1)
                .findFirst()
                .get()
                .getKey();

        System.out.println(str1);

        //alternate
        List<String> distinct2 = new ArrayList<>();

        Arrays.stream(arr1)
                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .forEach(e -> distinct2.add(e.getKey()));

        System.out.println(distinct2);
        // Check if the k-th distinct string exists
        if (k1 <= distinct2.size()) {
            // Return the k-th distinct string (1-based index)
            System.out.println(distinct2.get(k1 - 1));
        } else {
            // If there are fewer than k distinct strings, return an empty string
            System.out.println("");
        }
    }
}

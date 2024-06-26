package Leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindTheDifferenceOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
//        List<Integer> num1Integers = Arrays.stream(nums1).boxed()
//                .filter(e -> e.intValue() !=
//                        Arrays.stream(nums2).boxed()
//                                .distinct().mapToInt(k -> k).iterator()
//                                .next().intValue())
//                .collect(Collectors.toList());
//        System.out.println(num1Integers);
//     System.out.println(Arrays.stream(nums2).anyMatch(e-> num1Integers.contains(e)));



        HashSet<Integer> set = new HashSet<>();
        for (int n : nums1) set.add(n);

        HashSet<Integer> set1 = new HashSet<>();
        for (int n : nums2) set1.add(n);

        HashSet<Integer> list = new HashSet<>();
        HashSet<Integer> list1 = new HashSet<>();
        for (int n1 : nums2) {
            if (!set.contains(n1)) {
                list.add(n1);
            }
        }
        for (int n2 : nums1) {
            if (!set1.contains(n2)) {
                list1.add(n2);
            }
        }
        System.out.println(list.stream().toList());
        System.out.println(list1.stream().toList());
    }

}


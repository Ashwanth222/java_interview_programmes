package Leetcode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindTheDifferenceOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};

       Set<Integer> set12 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        Set<Integer> set13 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());

        Set<Integer> unique1 = Arrays.stream(nums1).boxed().filter(i -> !set12.contains(i)).collect(Collectors.toSet());
        Set<Integer> unique2 = Arrays.stream(nums2).boxed().filter(i -> !set13.contains(i)).collect(Collectors.toSet());

        System.out.println("unique1" + unique1);
        System.out.println("unique2" + unique2);

        //alternate

        Set<Integer> integerSet1 = Arrays.stream(nums1).boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting())).keySet();
        Set<Integer> integerSet2 = Arrays.stream(nums2).boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting())).keySet();

        List<Integer> integerList1 = integerSet2.stream().filter(i -> !integerSet1.removeAll(Collections.singleton(i)))
                .toList();
        List<Integer> integerList2 = integerSet1.stream().filter(i -> !integerSet2.removeAll(Collections.singleton(i)))
                .toList();
        System.out.println("integerList" + integerList1);
        System.out.println("integerList" + integerList2);
        List<Integer> uniqueIntegers = new ArrayList<>();
        uniqueIntegers.addAll(integerList1);
        uniqueIntegers.addAll(integerList2);
       System.out.println("uniqueIntegers" + uniqueIntegers);
//        List<Integer> num1Integers = Arrays.stream(nums1).boxed()
//                .filter(e -> e.intValue() !=
//                        Arrays.stream(nums2).boxed()
//                                .distinct().mapToInt(k -> k).iterator()
//                                .next().intValue())
//                .collect(Collectors.toList());
//        System.out.println(num1Integers);
//     System.out.println(Arrays.stream(nums2).anyMatch(e-> num1Integers.contains(e)));


        //alternate
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


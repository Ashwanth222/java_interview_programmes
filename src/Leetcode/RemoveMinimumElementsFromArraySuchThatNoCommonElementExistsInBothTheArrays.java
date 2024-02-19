package Leetcode;

import java.util.*;
import java.util.stream.Collectors;

//
//Given two arrays A[] and B[] consisting of n and m elements respectively. Find the minimum number of elements to remove from each array such that no common element exist in both.
//
//        Examples:
//
//        Input : A[] = { 1, 2, 3, 4}
//        B[] = { 2, 3, 4, 5, 8 }
//        Output : 3
//        We need to remove 2, 3 and 4 from any array.
//
//        Input : A[] = { 4, 2, 4, 4}
//        B[] = { 4, 3 }
//        Output : 1
//        We need to remove 4 from B[]
//
//        Input : A[] = { 1, 2, 3, 4 }
//        B[] = { 5, 6, 7 }
//        Output : 0
//        There is no common element in both.
public class RemoveMinimumElementsFromArraySuchThatNoCommonElementExistsInBothTheArrays {
    public static void main(String[] args){
       int[] A = {4, 2, 4, 4};
       int[] B = {4, 3};
       Map<Integer,Long> map1 = Arrays.stream(A)
               .boxed()
               .collect(Collectors.groupingBy(e->e,Collectors.counting()));
       Map<Integer,Long> map2 = Arrays.stream(B)
               .boxed()
               .collect(Collectors.groupingBy(e->e,Collectors.counting()));
        Set<Integer> keys1 = map1.keySet();
        Set<Integer> keys2 = map2.keySet();
       List<Integer> keys3 = new ArrayList<>();
       long min= 0;
       for(Integer key: keys1){
           if(keys2.contains(key)){

                       keys3.add(key);
           min =  Math.min(map1.get(key),map2.get(key));
           }
       }
       System.out.println(keys3);
        System.out.println(min);

        //alternate
        int a[] = { 1, 2, 3, 4 };
        int b[] = { 2, 3, 4, 5, 8 };
        int n = a.length;
        int m = b.length;
        // To store count of array element
        HashMap<Integer, Integer> countA = new HashMap<
                Integer, Integer>();
        HashMap<Integer, Integer> countB = new HashMap<
                Integer, Integer>();

        // Count elements of a
        for (int i = 0; i < n; i++){
            if (countA.containsKey(a[i]))
                countA.put(a[i], countA.get(a[i]) + 1);

            else countA.put(a[i], 1);

        }

        // Count elements of b
        for (int i = 0; i < m; i++){
            if (countB.containsKey(b[i]))
                countB.put(b[i], countB.get(b[i]) + 1);

            else countB.put(b[i], 1);
        }

        // Traverse through all common element, and
        // pick minimum occurrence from two arrays
        int res = 0;

        Set<Integer> s = countA.keySet();

        for (int x : s)
            if(countB.containsKey(x))
                res += Math.min(countB.get(x),
                        countA.get(x));

        // To return count of minimum elements
        System.out.println(res);


    }
}

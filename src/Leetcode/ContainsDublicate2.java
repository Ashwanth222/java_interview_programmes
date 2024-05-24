package Leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDublicate2 {
    public static void main(String[] args){
        int[] arr = {5, 7, 8, 3, 6, 4, 2, 1, 7};
        int j = 0;
        Set<Integer> integers = new HashSet<>();
        for(int i = 0; i<arr.length; i++){
            if(integers.contains(arr[i])){
                j = j+1;
                System.out.println("contains dublicate");
            }else{
                integers.add(arr[i]);
            }
        }
        if(j == 0){
        System.out.println("doesn't contains dublicate");
        }

        //alternate

        Set<Integer> set = new HashSet<>();
        int[] arr1 = {5, 7, 8, 3, 6, 4, 2, 1};
        Arrays.stream(arr1).boxed().forEach(r -> set.add(r));
        if(arr1.length == set.size()){
            System.out.println("doesn't contains dublicate");
        }else{
            System.out.println("it contains dublicate");
        }
    }
}

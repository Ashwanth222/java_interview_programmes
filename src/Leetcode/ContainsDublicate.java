package Leetcode;

import java.util.Arrays;

public class ContainsDublicate {
    public static void main(String[] args){
        int[] arr = {5, 7, 8, 3, 6, 4, 2, 1};
        int j = 0;
        Arrays.sort(arr);
        for(int i = 1; i< arr.length ; i++ ){
            if(arr[i-1] == arr[i]){
                j = j+ 1;
                System.out.println("contains dublicates");
                break;
            }
        }if(j == 0){
            System.out.println("doesn't contain dublicates");
        }

        //alternate
        Arrays.sort(arr);
        int count = 0;
        for(int i =1; i<arr.length; i++){
            if(arr[i-1] == arr[i]){
                count ++;
                System.out.println("contains duplicate");
                break;
            }
        }
        if(count == 0){
            System.out.println("doesn't contains duplicate");
        }

        //alternate
        int[] arr1 = {5, 7, 8, 3, 6, 4, 2, 1};
        long count1 = Arrays.stream(arr1).boxed().distinct().count();
        System.out.println(count1);
        long count2 = Arrays.stream(arr1).boxed().count();
        System.out.println(count2);
        if(count1 != count2){
            System.out.println("contains duplicate");
        }else {
            System.out.println("not contains duplicate");
        }
    }
}

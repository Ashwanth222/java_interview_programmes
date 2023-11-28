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
    }
}

package Leetcode;

import java.util.Arrays;

public class PrintNearestNumberBasedOnInput {
    public static void main(String[] args){
        int[] arr = {1,2,5,9,6,3,-3};

        int input =7;
        Arrays.sort(arr);
        int temp1 = 0;
        int temp2 = 0;
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i<arr.length;i++){
            if(arr[i] <= input){
                temp1 = arr[i];
                // System.out.println(arr[i]);
            } else if (arr[i] > input) {
                temp2 = arr[i];
                break;
            }
        }
//System.out.println(temp1);
//        System.out.println(temp2);

        int temp3 = input - temp1;
        int temp4 = temp2 - input;
        if(temp3<=temp4){
            System.out.println(temp1);
        }else {
            System.out.println(temp2);

        }
    }
}

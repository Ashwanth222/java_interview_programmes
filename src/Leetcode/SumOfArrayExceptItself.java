package Leetcode;

import java.util.Arrays;

public class SumOfArrayExceptItself {
    public static void main(String[] args){
        int[] arr = {2,6,8,3,5};
        int l = arr.length-1;
        int temp = 1;
        int[] result = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(i!=j){
                    result[i] = result[i]+ (temp * arr[j]);
                }
            }
        }
        System.out.println("result" + " = " +Arrays.toString(result));
        for(int i= 0; i<=arr.length-1;i++) {
            System.out.println(result[i]);
        }

        //alternate java 8
        int sum = Arrays.stream(arr).reduce(0,(a,b)-> a+b);
        Arrays.stream(arr).map(p-> sum-p).forEach(System.out::println);
    }
}

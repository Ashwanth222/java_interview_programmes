package Leetcode;

import java.util.Arrays;

public class SumOfElementsAtRightSideEqualToLeftFromAnyPoint {
    public static void main(String[] args){
      int[] arr = {4,2,1,4,4,3};
      for(int i = 0; i<=arr.length-1;i++){
      int evenSum =  Arrays.stream(arr).limit(i).sum();
            for(int j = i+2; j<=arr.length-1;j++){
            int oddSum =    Arrays.stream(arr).skip(j-1).sum();
                if(evenSum == oddSum){
                    System.out.println(j-2 +" is the mid point"+ " " +
                            " from this mid point left side  and right side numbers are equal");
                }
            }
        }
    }
}

package Leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//You are given an integer num. You can swap two digits at most once to get the maximum valued number.
//
//Return the maximum valued number you can get.
//
//
//Example 1:
//
//Input: num = 2736
//Output: 7236
//Explanation: Swap the number 2 and the number 7.
//Example 2:
//
//Input: num = 9973
//Output: 9973
//Explanation: No swap.
public class MaximumSwap {
    public static void main(String[] args) {

        int num = 2736;
        // Convert number to string for digit manipulation
        char[] numArr = Integer.toString(num).toCharArray();
        int n = numArr.length;

        // Track the last occurrence of each digit (0-9)
        int[] last = new int[10];
        System.out.println("last" + Arrays.toString(last));
        for (int i = 0; i < n; i++) {
            last[numArr[i] - '0'] = i;
        }
        System.out.println("list after modification : " + Arrays.toString(last));

        // Traverse the number from left to right
        for (int i = 0; i < n; i++) {
            // Check if we can find a larger digit to swap
            for (int d = 9; d > numArr[i] - '0'; d--) {
                if (last[d] > i) {
                    // Swap and return the new number
                    char temp = numArr[i];
                    numArr[i] = numArr[last[d]];
                    numArr[last[d]] = temp;
                    Integer.parseInt(new String(numArr));
                }
            }
        }
        System.out.println("numArr " + Arrays.toString(numArr));

        // Return the original number if no swap occurred
        System.out.println(num);


        //alternate
        //int num1 = 5826;
        //int num1 = 2736;
        int num1 = 9973;
        int highestValue = Arrays.stream(String.valueOf(num1).split(""))
                .mapToInt(Integer::parseInt)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .findFirst()
                .get()
                .intValue();

        System.out.println("highestValue " + highestValue);

//        int lowestValue = Arrays.stream(String.valueOf(num1).split(""))
//                .mapToInt(Integer::parseInt)
//                .boxed()
//                .sorted(Comparator.naturalOrder())
//                .findFirst()
//                .get()
//                .intValue();
//
//        System.out.println("lowestValue " + lowestValue);

        long count = Arrays.stream(String.valueOf(num1).split(""))
                .count();
        System.out.println("count " + count);
        int[] newArray = Arrays.stream(String.valueOf(num1).split("")).mapToInt(Integer::parseInt).toArray();
        System.out.println("newArray " + Arrays.toString(newArray));
//        int temp1;
//        int temp2;
//        for (int i = 0; i < count; i++){
//            if(newArray[i] == (highestValue)){
//                temp1 = newArray[i];
//            }
//            if(newArray[i] == (lowestValue)){
//                temp2 = newArray[i];
//            }
//        }
        int temp;
        int[] ints = new int[newArray.length];
        System.out.println("ints starting " + Arrays.toString(ints));
        int j = 0;
        for (int i = 0; i < count; i++){
            if(newArray[i] == highestValue){
                ints[j] = highestValue;
                j=j+1;
                break;
            }
        }
//        for (int i = 0; i < count; i++){
//            if(newArray[i] == lowestValue){
                ints[j] = newArray[0];
                j = j+1;
//                break;
//            }
//        }
        System.out.println(" count " + count);
        System.out.println("ints middle" + Arrays.toString(ints));
     //   System.out.println(newArray);
        for (int k =j; k < count; k++){
            if((newArray[k] != (highestValue))){
                ints[j] = newArray[k];
                j++;
            }
        }
        System.out.println("ints ending" + Arrays.toString(ints));

    }
}

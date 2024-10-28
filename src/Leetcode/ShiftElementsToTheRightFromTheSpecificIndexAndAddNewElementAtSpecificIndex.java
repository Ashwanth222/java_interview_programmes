package Leetcode;

import java.util.Arrays;

//The concept is simple. I need to shift each element of the array over to the right by one place.
// This has to be done from an index that is provided by the user. Here's what should happen:
public class ShiftElementsToTheRightFromTheSpecificIndexAndAddNewElementAtSpecificIndex {
    public static void main(String[] args){

        //Expected output
        //{0, 1, 2, 3} --> add(4 (element), 1 (location)) --> {0, 4, 1, 2, 3}

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int[] newArray = new int[arr.length+1];
        System.out.println(Arrays.toString(arr));
        int k = 1;
        int newElement = 8;
        System.out.println(k);
        int j = k+1;
        int temp;
        for(int i = 0; i<newArray.length; i++){
            if (i >= 1){
                if(i == 1) {
                    newArray[i] = newElement;
                }else {
                    newArray[i] = arr[i-1];
                }
            }else {
                newArray[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}

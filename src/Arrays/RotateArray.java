package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args){
        int[] arr = {5, 7, 9, 2, 6, 4};
        int temp = 0;
        for(int i = 0; i<arr.length; i++){
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            i++;
        }
        System.out.println(Arrays.toString(arr));

        int[] arrr = {5, 7, 9, 2, 6, 4};
        //alternate
        int j = 0;
        temp = 0;
        while (j < arrr.length){
            temp = arrr[j];
            arrr[j] = arrr[j+1];
            arrr[j+1] = temp;
            j += 2;
        }
        System.out.println(Arrays.toString(arrr));
    }
}

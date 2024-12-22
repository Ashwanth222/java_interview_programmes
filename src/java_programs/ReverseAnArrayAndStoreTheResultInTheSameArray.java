package java_programs;

import java.util.Arrays;

public class ReverseAnArrayAndStoreTheResultInTheSameArray {
    public static void main(String[] args){
                int[] arr = {7,6,8,9,10};
                int j = 0;
                int temp ;
                for(int i = arr.length-1; i >arr.length/2; i--){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                    System.out.println(arr[i] +" --" + arr[j]);

                }
                System.out.println(Arrays.toString(arr));
    }
}

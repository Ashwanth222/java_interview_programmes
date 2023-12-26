package java_programs;

import java.util.Arrays;

public class RotateArrayByKTimes {
    public static void main(String[] args){
        int[] a = { 1, 2, 3, 4, 5, 6 };

        int k = 3;
        int temp = 0;
        int l = a.length-1;
            int m = l;
            for(int i = 0; i<k;i++){
                temp = a[i];
                a[i] = a[m];
                a[m] = temp;
                m--;
            }


        System.out.println(Arrays.toString(a));
    }
}

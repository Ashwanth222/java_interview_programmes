package Java8_programs;

import java.util.Arrays;

public class ProductOfIntegerArray {
    public static void main(String[] args){
        int[] arr = {1,2,6,7,8,4,3,9,1,2};
        int prod = Arrays.stream(arr).reduce(1, (a, b) -> a * b);
        System.out.println(prod);
    }
}

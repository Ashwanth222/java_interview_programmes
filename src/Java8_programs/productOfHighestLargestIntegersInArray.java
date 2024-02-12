package Java8_programs;

import java.util.Arrays;
import java.util.Comparator;

public class productOfHighestLargestIntegersInArray {
    public static void main(String[] args){
        //int[] arr = {3,6,7,8,6,2,9};
        int[] arr = {-3,-6,-7,-8,-6,-2,-9};
        //int[] arr = {};
        int product = Arrays.stream(arr).boxed()
                .sorted(Comparator.reverseOrder())
                .limit(2).reduce((a, b) -> a * b).orElse(0);
        System.out.println(product);
    }
}

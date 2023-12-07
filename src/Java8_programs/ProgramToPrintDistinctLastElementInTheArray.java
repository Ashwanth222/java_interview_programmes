package Java8_programs;

import java.util.Arrays;
import java.util.Comparator;
//print last element in the unique list
public class ProgramToPrintDistinctLastElementInTheArray {
    public static void main(String[] args){
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int a = Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(a);
    }
}

package Java8_programs;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;

public class SumOfTwoEqualToTargetAtIndexIJ {

        private static void showPairs(int k, int[] array) {

            IntStream.range(0, array.length)
                    .boxed()
                    .flatMap(i -> IntStream.range(i, array.length)
                            .boxed()
                            .filter(j -> k - array[i] == array[j])
                            .flatMap(j -> Stream.of(new int[] { i, j }, new int[] { j, i }))) // [i, j] and [j, i]
                    .forEach(arr -> System.out.println(Arrays.toString(arr)));
        }
    public static void main(String[] args){
            int[] arr = { 8, 5, 3, 6, 7, 9};
            showPairs(13, arr);
    }
}

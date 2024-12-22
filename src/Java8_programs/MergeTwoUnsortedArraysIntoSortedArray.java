package Java8_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArraysIntoSortedArray {
    public static void main(String[] args){
        int[] arrayA = new int[] {7, -5, 3, 8, -4, 11, -19, 21};

        int[] arrayB = new int[] {6, 13, -7, 0, 11, -4, 3, -5};

        IntStream.concat(Arrays.stream(arrayA), Arrays.stream(arrayB))
                .sorted().distinct().forEach(System.out::println);

        //alternate
        List<Integer> arrayList = new ArrayList<>();

        Arrays.stream(arrayA).sorted().boxed().forEach(e -> arrayList.add(e));
        Arrays.stream(arrayB).sorted().boxed().forEach(e -> arrayList.add(e));
        int[] arr = arrayList.stream().mapToInt(e -> e).toArray();
        System.out.println(Arrays.toString(arr));
    }
}

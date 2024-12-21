package Java8_programs;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UnionOfArrays {
    public static void main(String[] args) {
        int[] inputArray1 = {2, 3, 4, 7, 1};

        int[] inputArray2 = {4, 1, 3, 5};

        int[] inputArray3 = {8, 4, 6, 2, 1};

        int[] inputArray4 = {7, 9, 4, 1};

        int[] integers1 = IntStream.concat(Arrays.stream(inputArray1), Arrays.stream(inputArray2)).toArray();
        int[] integers2 = IntStream.concat(Arrays.stream(inputArray3), Arrays.stream(inputArray4)).toArray();
        int[] allIntegers = IntStream.concat(Arrays.stream(integers1), Arrays.stream(integers2)).toArray();
        System.out.println(Arrays.toString(allIntegers));

        List unionIntegers = Arrays.stream(allIntegers).boxed().distinct().collect(Collectors.toList());
        System.out.println(unionIntegers);

        //alternate
        Set<Integer> union1 = new HashSet<>();
        Arrays.asList(Arrays.stream(inputArray1).boxed().collect(Collectors.toList()),
                        Arrays.stream(inputArray2).boxed().collect(Collectors.toList()),
                        Arrays.stream(inputArray3).boxed().collect(Collectors.toList()),
                        Arrays.stream(inputArray4).boxed().collect(Collectors.toList()))
                .stream()
              .flatMap(List::stream).forEach(e -> union1.add(e));
        System.out.println(union1);

        //alternate
        Set<Integer> union = new HashSet<>();
        Arrays.stream(inputArray1).boxed().forEach(e -> union.addAll(Collections.singleton(e)));
        Arrays.stream(inputArray2).boxed().forEach(e -> union.addAll(Collections.singleton(e)));
        Arrays.stream(inputArray3).boxed().forEach(e -> union.addAll(Collections.singleton(e)));
        Arrays.stream(inputArray4).boxed().forEach(e -> union.addAll(Collections.singleton(e)));
        System.out.println("list" + union);

    }
}

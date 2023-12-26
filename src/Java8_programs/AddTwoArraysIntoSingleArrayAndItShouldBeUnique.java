package Java8_programs;

import java.util.*;
import java.util.stream.Collectors;

public class AddTwoArraysIntoSingleArrayAndItShouldBeUnique {
    public static void main(String[] args) {
        int[] arr1 = {4, 6, 8, 9, 2};
        int[] arr2 = {6, 8, 4, 3, 8, 2, 6};

        List<Integer> integers1 = Arrays.stream(arr1).distinct().boxed().sorted().collect(Collectors.toList());
        List<Integer> integers2 = Arrays.stream(arr2).distinct().boxed().sorted().collect(Collectors.toList());

        List<Integer> combinedIntegers = new ArrayList();
        for (int i = 0; i < integers1.size(); i++) {
            combinedIntegers.add(integers1.get(i));
        }
        for (int i = 0; i < integers2.size(); i++) {
            combinedIntegers.add(integers2.get(i));
        }
        combinedIntegers.stream().sorted().distinct().forEach(System.out::println);
        Object[] integers3 = combinedIntegers.toArray();
        System.out.println(Arrays.toString(Arrays.stream(integers3).distinct().toArray()));
    }
}

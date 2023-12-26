package java_programs;

import java.util.*;

public class ProgramToArrangeUniqueElementsAndReturnLastIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int a = Arrays.stream(arr).boxed().distinct()
                .sorted(Comparator.reverseOrder()).findFirst().get();  //method 1

        int b = Arrays.stream(arr).boxed().distinct()
                .min(Comparator.reverseOrder()).get();    //method 2

        Arrays.stream(arr).boxed().distinct()
                .min(Comparator.reverseOrder()).ifPresent(System.out::println);

        Arrays.stream(arr).distinct()
                .max().ifPresent(System.out::println);
        System.out.println(a);
        System.out.println(b);
    }
}

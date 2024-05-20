package java_programs;

import java.util.*;

public class ProgramToArrangeUniqueElementsAndReturnLastIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};

        List<Integer> list = new ArrayList<>();
        Arrays.stream(arr).boxed().distinct().forEach(e -> list.add(e));
        int k = list.get(list.size()-1);
        System.out.println(list.indexOf(k));

        //alternate
        List<Integer> list1 = new ArrayList<>();
        Arrays.stream(arr).boxed().forEach(e -> list1.add(e));
        System.out.println(list.lastIndexOf(list1.get(list1.size()-1)));

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

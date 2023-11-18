package Java8_programs;

import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDublicateElementsFromList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 1, 2, 3);
        integerList.stream().distinct().forEach(System.out::println);  //method1

        Set<Integer> noDublicates = integerList.stream().collect(Collectors.toSet());  //method2
        System.out.println(noDublicates);

        integerList.stream().collect(Collectors.toSet()).forEach(System.out::println);   //method3
    }
}

package Java8_programs;

//How do you extract duplicate elements from an array?

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDublicateElementsInArray {
    public static void main(String[] args)
    {
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);

        Set<Integer> uniqueElements = new HashSet<>();

        List<Integer> duplicateElements = listOfIntegers.stream()
                .filter(i -> ! uniqueElements.add(i))
                .collect(Collectors.toList());

        System.out.println(duplicateElements);

        //alternate
        Set<Integer> integerSet = new HashSet<>();
        listOfIntegers.stream()
                .filter(e -> !integerSet.add(e))
                .forEach(e -> System.out.println(e));

        //alternate
        listOfIntegers.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i -> i.getValue()> 1)
                .forEach( e -> System.out.println(e.getKey()));


    }
}

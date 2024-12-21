package Java8_programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDublicateStringElements {
    public static void main(String[] args){
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC", "BB");
        Map<String,Long> namesCount = names
                .stream()
                .filter(x->Collections.frequency(names, x)>1)
                .collect(Collectors.groupingBy
                        (Function.identity(), Collectors.counting()));
        System.out.println(namesCount);

        //alternate
                names.stream()
                        .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                        .entrySet()
                        .stream()
                        .filter(e -> e.getValue()>1)
                        .forEach(e -> System.out.println(e.getKey()));


        //alternate
        Set<String> integerSet = new HashSet<>();
        List<String> stringList = names.stream()
                .filter(i -> !integerSet.add(i))
                .toList();
        System.out.println(stringList);
    }
}

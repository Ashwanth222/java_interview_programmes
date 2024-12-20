package Java8_programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class AnagramsInTheArray {
    public static void main(String[] args){

        String[] strings = {"listen", "silent", "hello", "world", "night", "thing"};
        List<String> strings1 = Arrays.stream(strings)
                .map(e -> Arrays.stream(e.split("")).sorted().collect(Collectors.joining("")))
                .toList();
        System.out.println(strings1);
        List<String> map = strings1.stream()
                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter( r -> r.getValue()>1)
                .map(e -> e.getKey())
                .toList();
        System.out.println("-------------------------");

        System.out.println(map);

        System.out.println("-------------------------");

        Arrays.stream(strings)
                .filter(e -> map.contains(Arrays.stream(e.split("")).sorted().collect(Collectors.joining(""))))
                .forEach(System.out::println);
    }
}

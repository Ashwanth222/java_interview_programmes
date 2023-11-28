package Java8_programs;

import java.util.*;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MostFrequentElementInArray {
    public static void main(String[] args){
        int[] arr = {4, 5, 8, 7, 4, 7, 6,7};

        //get most repeated key
        int key = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(ele ->ele.getValue()>1)
                .sorted((s1,s2)->s2.getValue().intValue()- s1.getValue().intValue())
                .findFirst().get().getKey().intValue();
        System.out.println(key);

        //get most repeated value
        int value = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(ele ->ele.getValue()>1)
                .sorted((s1,s2)->s2.getValue().intValue()- s1.getValue().intValue())
                .findFirst().get().getValue().intValue();
        System.out.println(value);

        //method 2 most repeated key and value
        Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(ele ->ele.getValue()>1)
                .sorted((s1,s2)->s2.getValue().intValue()- s1.getValue().intValue())
                .findFirst().ifPresent(System.out::println);

        //method 3 most repeated key and value
        Stream.of(1, 3, 4, 3, 4, 3, 2, 3, 3, 3, 3, 3)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(System.out::println);

        Integer maxVal = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max((o1, o2) -> o1.getValue().compareTo(o2.getValue()))
                .map(Map.Entry::getKey).orElse(null);
        System.out.println(maxVal);
    }
}

package Java8_programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStringElementsAccordingToLength {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "pear", "kiwi", "orange");

        Map<Integer, List<String>> map = words.stream()
                .collect(Collectors.groupingBy(e -> e.length()));

        System.out.println(map);

    }
}

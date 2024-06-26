package Java8_programs;

//Find first repeated character in a string?

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProgramToFindRepeatedCharacterInString {
    public static void main(String[] args)
    {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

        Map<String, Long> charCountMap =
                Arrays.stream(inputString.split(""))
                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        charCountMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                        .forEach(e -> System.out.println(e.getKey()));
    }
}

package Java8_programs;

//Print duplicate characters in a string?

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDublicateCharactersInString {
    public static void main(String[] args)
    {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

        Set<String> uniqueChars = new HashSet<>();

        Set<String> duplicateChars =
                Arrays.stream(inputString.split(""))
                        .filter(ch -> ! uniqueChars.add(ch))
                        .collect(Collectors.toSet());

        System.out.println(duplicateChars);

        //method 2
        Arrays.stream(inputString.replace(" ", "").toLowerCase()
                .split(""))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .filter(i -> i.getValue() > 1)
                .forEach(e -> System.out.println(e.getKey()));
    }
}

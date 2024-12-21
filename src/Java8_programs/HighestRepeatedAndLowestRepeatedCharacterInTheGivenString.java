package Java8_programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HighestRepeatedAndLowestRepeatedCharacterInTheGivenString {
    public static void main(String[] args){
        String str = "This Is Mysore Palace";
        String highestRepeated = Arrays.stream(str.replaceAll(" ", "").toLowerCase().split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((e1,e2) -> e2.getValue().intValue() - e1.getValue().intValue())
                .findFirst()
                .get()
                .getKey();
        System.out.println(highestRepeated);

        String highestRepeated1 = Arrays.stream(str.replaceAll(" ", "").toLowerCase().split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
        System.out.println(highestRepeated1);

        String lowestRepeated = Arrays.stream(str.replaceAll(" ", "").toLowerCase().split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .findFirst()
                .get()
                .getKey();
        System.out.println(lowestRepeated);

        String lowestRepeated1 = Arrays.stream(str.replaceAll(" ", "").toLowerCase().split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .min(Map.Entry.comparingByValue())
                .get()
                .getKey();
        System.out.println(lowestRepeated1);
    }
}

package Java8_programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateRepeatingAndNonRepeatingCharacterInString {
    public static void main(String[] args){
        String s = "HI|HOW|ARE|YOU";

        Map<Boolean, List<Map.Entry<String, Long>>> map = Arrays.stream(s.split("")).collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream().collect(Collectors.partitioningBy(e -> e.getValue().intValue() == 1));

        System.out.println(map);

        //alternate
        Arrays.stream(s.split("")).collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue()>1).forEach(e -> System.out.println(e.getKey() + e.getValue()));
        System.out.println("----------------------------");
        Arrays.stream(s.split("")).collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).forEach(e -> System.out.println(e.getKey() + e.getValue()));


    }
}

package Java8_programs;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfCharacters {
    public static void main(String[] args){
        String s1 = "hi hello how are you";
        Arrays.stream(s1.split("")).map(e -> e.toLowerCase()).map(k -> k.replaceAll(" ", ""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().skip(1).forEach(e -> System.out.println(e.getKey() + " "+ e.getValue()));

    }
}

package Java8_programs;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfCharacters {
    public static void main(String[] args){
        String s1 = "hi hello how are you";
        Arrays.stream(s1.replaceAll(" ", "").split("")).map(e -> e.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().forEach(e -> System.out.println(e.getKey() + " "+ e.getValue()));

        Arrays.stream(s1.replaceAll(" ", "").split(""))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet()
                .forEach(e -> System.out.println("e.getKey() = " + e.getKey() +"  and  " + "e.getValue() = "+e.getValue()));
    }
}

package Java8_programs;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeatedCharacterInString {
    public static void main(String[] args){
        String input = "Jva rticles are Awesome";
        Character sb = input.chars()
                .mapToObj(ch1 -> (char) ch1)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                // linked hash map for maintaining insertion order
                .entrySet()
                .stream()
                .filter(f->f.getValue() > 1L)
                .findFirst()
                .get()
                .getKey();
        System.out.println(sb);
    }
}

package Java8_programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharacterInString {
    public static void main(String[] args){
        String input = "Java articleJs arve Awesome";
        Character sb = input.chars()
                .mapToObj(ch1 -> (char) ch1)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                // linked hash map for maintaining insertion order
                .entrySet()
                .stream()
                .filter(f->f.getValue() == 1L)
                .findFirst()
                .get()
                .getKey();
        System.out.println(sb);

        String sb1 = Arrays.stream(input.replace(" ","")
                .split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                // linked hash map for maintaining insertion order
                .entrySet()
                .stream()
                .filter(f->f.getValue() == 1L)
                .findFirst()
                .get()
                .getKey();
        System.out.println(sb1);

//                                   .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
//                .entrySet()
//                .stream()
//                .filter(entry -> entry.getValue() > 1L)
//                .map(entry -> entry.getKey())
//                .findFirst()
//                .get();
//        System.out.println(result);
    }
}

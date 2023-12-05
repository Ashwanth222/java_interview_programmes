package Java8_programs;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {
    public static void main(String[] args){
        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
        Set<String> strings1 = Arrays.stream(s1).collect(Collectors.toSet());
        System.out.println(strings1);
        Set<String> strings2 = Arrays.stream(s2).collect(Collectors.toSet());
        System.out.println(strings2);
        System.out.println( strings1.retainAll(strings2));
        strings1.retainAll(strings2);
        System.out.println(strings1);
    }
}

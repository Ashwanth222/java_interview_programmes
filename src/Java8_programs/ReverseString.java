package Java8_programs;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args){
        String s1 = "string";
        String s2 = Stream.of(s1).map(s -> new StringBuffer(s).reverse()).collect(Collectors.joining());
        System.out.println(s1);
        System.out.println(s2);
    }
}

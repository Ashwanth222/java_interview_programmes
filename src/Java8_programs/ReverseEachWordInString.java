package Java8_programs;

//Reverse each word of a string using Java 8 streams?

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordInString {
    public static void main(String[] args)
    {
        String str = "Java Concept Of The Day";

        String reversedStr = Arrays.stream(str.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(reversedStr);
    }
}

package Java8_programs;

//Reverse each word of a string using Java 8 streams?

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWordInString {
    public static void main(String[] args)
    {
        String str = "Java Concept Of The Day";

        String reversedStr = Arrays.stream(str.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(reversedStr);

        //alternate
        StringBuffer sb = new StringBuffer();
        Arrays.stream(str.split(" ")).map(word -> new StringBuffer(word).reverse())
                .forEach(e -> sb.append(e +" "));
        System.out.println(sb);

        //alternate
        StringJoiner sj = new StringJoiner(" ");
        Arrays.stream(str.split(" "))
                .map(word -> new StringBuffer(word).reverse()).forEach(e -> sj.add(e));
        System.out.println(sj);

        //alternate
        String s3 = Stream.of(str.split(" ")).map(s -> new StringBuffer(s).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(s3);

    }
}

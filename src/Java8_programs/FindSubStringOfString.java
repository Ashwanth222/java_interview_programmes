package Java8_programs;

import java.util.stream.IntStream;

public class FindSubStringOfString {

    public static void main(String[] args) {

        String str = "abc";

        IntStream.range(0, str.length())
                .boxed()
                .flatMap(i ->
                        IntStream.rangeClosed(i + 1, str.length())
                                .mapToObj(j -> str.substring(i, j)))
                .forEach(System.out::println);
    }
}
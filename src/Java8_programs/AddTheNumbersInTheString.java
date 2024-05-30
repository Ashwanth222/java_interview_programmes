package Java8_programs;

import java.util.Arrays;

public class AddTheNumbersInTheString {
    public static void main(String[] args) {
        String s = "a12b34c6";

        int sum = Arrays.stream(s.replaceAll("[a-z]", " ")
                        .split(" ")).skip(1)
                .mapToInt(k -> Integer.parseInt(k))
                .reduce(0, (a, b) -> a+b);
        System.out.println(sum);

    }
}

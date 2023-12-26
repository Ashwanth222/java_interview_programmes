package Java8_programs;

//Find sum of all digits of a number in Java 8?

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;

public class SumOfAllDigitsOfANumber {
    public static void main(String[] args)
    {
        int i = 15623;
        //method 1
        Integer sumOfDigits = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
        //method2
        System.out.println((Integer) Arrays.stream(Integer.toString(i).split("")).mapToInt(Integer::parseInt).sum());

        System.out.println(sumOfDigits);
    }
}

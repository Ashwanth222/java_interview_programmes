package Java8_programs;

//Print first 10 even numbers

import java.util.stream.IntStream;

public class PrintFirstTenEvenNumbers {
    public static void main(String[] args)
    {
        IntStream.rangeClosed(1, 10).map(i -> i * 2).forEach(System.out::println);
    }
}

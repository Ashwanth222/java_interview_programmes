package Java8_programs;

//How do you find sum of first 10 natural numbers?

import java.util.stream.IntStream;

public class SumOfTenNumbers {
    public static void main(String[] args)
    {
        int sum = IntStream.range(1, 11).sum();

        System.out.println(sum);
    }
}

package java_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SumOfAllPrimeNumbersBetweenTwoGivenNumbers {
    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 200;
        int count = 0;
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count > 0) {
                // System.out.println("is not a prime"+i);
            } else {
                sum = sum + i;
                System.out.println(i + "is a prime" + "sum is: " + sum);
            }
            count = 0;
        }
        System.out.println("total sum is " + sum);

        //alternate

        //SumOfAllPrimeNumbersBetweenTwoGivenNumbers

        List<Integer> summ = new ArrayList<>();
        for (int i = 100; i <= 200; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    summ.add(i);
                    break;
                }
            }
        }
        System.out.println(sum);
        int sum1 = IntStream.range(100, 201).sum();
        int sum2 = summ.stream().reduce(0, (a, b) -> a + b);
        int sumOfPrimeNumbers = sum1 - sum2;
        System.out.println("sumOfPrimeNumbers" + sumOfPrimeNumbers);

    }
}

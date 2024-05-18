package Java8_programs;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

//8) Given a list of integers, find maximum and minimum of those numbers?
public class FindMaxAndMin {
    public static void main(String[] args)
    {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        int max1 = listOfIntegers.stream().sorted(Comparator.reverseOrder()).findFirst().get();

        int max2 = listOfIntegers.stream().max(Comparator.naturalOrder()).get();

        System.out.println("Maximum Element : "+max1);
        System.out.println("Maximum Element : "+max2);

        int min1 = listOfIntegers.stream().sorted(Comparator.naturalOrder()).findFirst().get();

        int min2 = listOfIntegers.stream().min(Comparator.naturalOrder()).get();

        System.out.println("Minimum Element : "+min1);
        System.out.println("Minimum Element : "+min2);

    }
}

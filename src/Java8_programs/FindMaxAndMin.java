package Java8_programs;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

//8) Given a list of integers, find maximum and minimum of those numbers?
public class FindMaxAndMin {
    public static void main(String[] args)
    {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        int max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();

        System.out.println("Maximum Element : "+max);

        int min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();

        System.out.println("Minimum Element : "+min);
    }
}

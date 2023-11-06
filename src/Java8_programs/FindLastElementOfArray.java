package Java8_programs;

import java.util.List;
import java.util.Arrays;

public class FindLastElementOfArray {
    public static void main(String[] args)
    {
        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");

        String lastElement = listOfStrings.stream().skip(listOfStrings.size() - 1).findFirst().get();

        System.out.println(lastElement);
    }
}

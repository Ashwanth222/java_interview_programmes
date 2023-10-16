package Java8_programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromList {
    public static void main(){
        List<Integer> d_numbers = Arrays.asList(23,54,76,54,45,76);
        Set<Integer> numbers = new HashSet<Integer>(d_numbers);
        System.out.println("i = "
                +numbers);
        d_numbers.stream().distinct().forEach(System.out::println);
    }
}

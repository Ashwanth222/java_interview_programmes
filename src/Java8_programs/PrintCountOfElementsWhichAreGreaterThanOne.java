package Java8_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//here 3 is repreated 2 times
// 5 repeated 3 times
//-7 repeated 2 times
// so which which are containing more than one time should be counted
// here 3 numbers are more than 1 time repeated so answer is 3
public class PrintCountOfElementsWhichAreGreaterThanOne {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 5, -7, 5, 3, 5, -7);
        long c = numbers.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet()
                .stream().filter(e -> e.getValue() > 1).map(e -> e.getKey()).distinct().count();
    }
}

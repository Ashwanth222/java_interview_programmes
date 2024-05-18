package Java8_programs;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NoRepeatedElementsInArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,5,2,2,1};
        Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).forEach(k -> System.out.println(k.getKey()));

    }
}

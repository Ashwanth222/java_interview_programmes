package Java8_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquaresOfASortedArray {
    public static void main(String[] args){
        int[] integers1 = {-2,-8,5,-4,9,6,1};
        int[] integers2 = {2,8,5,4,9,6,1};
        List<Integer> square = Arrays.stream(integers1).boxed().sorted().map(i -> i*i)
                .collect(Collectors.toList());
        System.out.println(square);
    }
}

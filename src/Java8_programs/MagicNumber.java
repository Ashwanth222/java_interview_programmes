package Java8_programs;

import java.util.Arrays;
import java.util.stream.Collectors;
// If sum is equal to 1, then given number is a magic number.
public class MagicNumber {
    public static void main(String[] args){
        String i = "1252";
        Integer sum = Arrays.stream(i.split("")).mapToInt(Integer::parseInt).boxed()
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum);
        Integer sum1 = Arrays.stream(sum.toString().split("")).mapToInt(e -> Integer.parseInt(e)).boxed()
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum1);
    }
}

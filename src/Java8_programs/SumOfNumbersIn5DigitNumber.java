package Java8_programs;

import java.util.Arrays;

public class SumOfNumbersIn5DigitNumber {
    public static void main(String[] args){
        int a = 98765;
        int sum = Arrays.stream(String.valueOf(a).split("")).mapToInt(i -> Integer.parseInt(i)).sum();
        System.out.println(sum);
        
        //alternate
    }
}

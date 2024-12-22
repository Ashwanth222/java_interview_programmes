package Java8_programs;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintReverseOfPositiveAndNegativeNumber {
    public static void main(String[] args){
        String i = "234";
        String j = "-567";
        String reverse = new StringBuffer(i).reverse().toString();
        System.out.println(reverse);
        if(j.indexOf('-')==0) {
            String reverseNegative = new StringBuffer(j.substring(1)).reverse().toString();
            System.out.println("-" + reverseNegative);
            System.out.println("-".concat(reverseNegative));
        }

    }
}

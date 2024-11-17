package Leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AddDigits {
    public static void main(String[] args){
        int num = 8769234;
        int sum = 0;
        while(num>0){
           int r =  num%10;
           sum = sum +r;
           num = num/10;
        }
        System.out.println(sum);

        //alternate

        int num1 = 8769234;
        int summ = Arrays.stream(String.valueOf(num1).split("")).mapToInt(e-> Integer.parseInt(e)).reduce(0,(a, b)-> a+b);
        System.out.println("sum" + summ);

        //alternate
        long summm = Arrays.stream(String.valueOf(num1).split("")).collect(Collectors.summarizingInt((e1) -> Integer.parseInt(e1))).getSum();
        System.out.println(summm);
    }
}

package Java8_programs;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args){
        String s1 = "string1 ";
        String s2 = "string2 ";
        String s3 = Stream.of(s1,s2).map(s -> new StringBuffer(s).reverse()).collect(Collectors.joining());
        System.out.println(s1);
        System.out.println(s3);

        //alternate
        String sb = new StringBuffer(s1).reverse().toString();
        System.out.println(sb);

        //alternate
        String sb1 = new StringBuilder(s1).reverse().toString();
        System.out.println(sb);
    }
}

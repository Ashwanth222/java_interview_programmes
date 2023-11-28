package Java8_programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindAnagramOrNot {
    public static void main(String[] args){
       String s1 = "abcde";
       String s2 = "bcdae";
       String  s3 = Arrays.stream(s1.split("")).sorted().collect(Collectors.joining(""));
        String  s4 = Arrays.stream(s2.split("")).sorted().collect(Collectors.joining(""));
        if(s3.equals(s4)){
            System.out.println("two strings are anagrams");
        }else{
            System.out.println("two strings are not Anagrams");
        }
    }
}

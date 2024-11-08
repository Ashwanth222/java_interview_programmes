package Java8_programs;

import java.util.Arrays;
import java.util.stream.Collectors;

//abc, bca -> true
//aaa, aaa -> true
//aab, bba -> false
//abc, def -> false
public class CheckingIf2StringsContainTheSameCharacters {
    public static void main(String[] args){
        String s1 = "abc";
        String s2 = "bca";
        String s3 = "aaa";
        String s4 = "aaa";
        String s5 = "daa";
        String s6 = "aca";

        String str1 = Arrays.stream(s1.split("")).sorted().collect(Collectors.joining(""));

        String str2 = Arrays.stream(s2.split("")).sorted().collect(Collectors.joining(""));

        System.out.println(Arrays.equals(str1.toCharArray(), str2.toCharArray()));

        //
        String str3 = Arrays.stream(s3.split("")).sorted().collect(Collectors.joining(""));

        String str4 = Arrays.stream(s4.split("")).sorted().collect(Collectors.joining(""));

        System.out.println(Arrays.equals(str3.toCharArray(), str4.toCharArray()));

        //

        String str5 = Arrays.stream(s5.split("")).sorted().collect(Collectors.joining(""));

        String str6 = Arrays.stream(s6.split("")).sorted().collect(Collectors.joining(""));

        System.out.println(Arrays.equals(str5.toCharArray(), str6.toCharArray()));
    }
}

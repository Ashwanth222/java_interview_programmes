package Leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] string = {"flower", "flow", "flight" };
        String[] strings = {"flower", "flow", "flight" };
//        List<String> stringss = Arrays.stream(string)
//                .sorted((s1, s2) -> s1.length() - s2.length()).toList();
//        System.out.println(stringss);
//        List<String> stringsss = Arrays.stream(string)
//                .sorted().toList();
//        System.out.println(stringsss);
//        for(int i = 0; i<stringsss.get(0).length();i++) {
//
//            int finalI1 = i;
//            stringsss.stream().skip(1)
//                   .filter(l -> l.charAt(finalI1) == stringsss.get(0).charAt(finalI1))
//                   .forEach(System.out::println);
//        }


        String prefix = strings[0];
        for(int i =1; i<strings.length;i++){
            while(strings[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        System.out.println("prefix  : " + prefix);
    }
}

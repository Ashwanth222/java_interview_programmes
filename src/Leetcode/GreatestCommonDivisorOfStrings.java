package Leetcode;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//For two strings s and t, we say "t divides s" if and only if s = t + ... + t
// (i.e., t is concatenated with itself one or more times).
//
//Given two strings str1 and str2, return the largest string x such that x divides
// both str1 and str2.
//
//
//
//Example 1:
//
//Input: str1 = "ABCABC", str2 = "ABC"
//Output: "ABC"
//Example 2:
//
//Input: str1 = "ABABAB", str2 = "ABAB"
//Output: "AB"
//Example 3:
//
//Input: str1 = "LEET", str2 = "CODE"
//Output: ""
public class GreatestCommonDivisorOfStrings {
    public static void main(String[] args){

        String s1 = "ABABABABAB";
        String s2 = "ABAB";
        String high = s1.length() > s2.length()?s1:s2;
        String low = s1.length() > s2.length()?s2:s1;
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i<low.length();i++){
           if(high.charAt(i) == low.charAt(i)){
               sb.append(low.charAt(i));
               if(i+1 == low.length()){
                   break;
               }
               if(low.charAt(0) == low.charAt(i+1) && i!=0){
                   break;
               }
           }else{
               System.out.println("not matching");
           }
        }
        System.out.println(sb.toString());

        //alternate

        Map<String, Long> map1 = Arrays.stream(s1.split("")).collect(Collectors.groupingBy(e-> e, Collectors.counting()));
        Map<String, Long> map2 = Arrays.stream(s2.split("")).collect(Collectors.groupingBy(e-> e, Collectors.counting()));

        System.out.println(map1);
        System.out.println(map2);
        int ll = map2.values().size()-1;
        System.out.println(map2.values().size());
        StringBuffer sb2 = new StringBuffer();
        Set<String> set = map1.keySet();
        if(set.size()-1 == ll){
            System.out.println(set);
            set.stream().forEach(g-> sb2.append(g));
        }
        System.out.println("greatest common divisor of two strings  " + sb2);

        //alternate
        String str1 = "ABCABC";
        String str2 = "LKHG";
        Map<String, Long> map3 = Arrays.stream(str1.split(""))
                .collect(Collectors.groupingBy(e-> e, LinkedHashMap::new, Collectors.counting()));
        Map<String, Long> map4 = Arrays.stream(str2.split(""))
                .collect(Collectors.groupingBy(e-> e, LinkedHashMap::new, Collectors.counting()));
        System.out.println(map3);
        System.out.println(map4);
        map3.keySet();
        map4.keySet();
        int l = map4.size();
        String s5 = str2.substring(0, map4.size());
        String s6 = str1.substring(0, map3.size());
        System.out.println(s5);
        System.out.println(s6);
        if(s5.equals(s6) && s5 != null){
            System.out.println("greatest common divisor of two strings  " + s5);
        }else {
            System.out.println("two strings are not common ");
        }
    }
}

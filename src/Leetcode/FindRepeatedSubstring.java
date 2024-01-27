package Leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Repeated Substring Pattern
//Easy
//6.3K
//504
//Companies
//Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.
//
//
//
//Example 1:
//
//Input: s = "abab"
//Output: true
//Explanation: It is the substring "ab" twice.
//Example 2:
//
//Input: s = "aba"
//Output: false
//Example 3:
//
//Input: s = "abcabcabcabc"
//Output: true
//Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
public class FindRepeatedSubstring {
    public static void main(String[] args){
        String s = "abcdeabcdeabcde";
//        String string =Arrays.stream(s.split(""))
//                .distinct().toList().toString();
//        System.out.println(string);
//        for(int i = 0;i<s.length();i=i+string.length()){
//           // s.substring(1,i);
//            System.out.println(" ");
//            System.out.print(s.substring(0,i+string.length()));
//        }

        String concatenated = s+s;
       // System.out.println(concatenated);
        boolean s4 = concatenated.substring(1,concatenated.length()-1).contains(s);
       // System.out.println(concatenated.substring(1,concatenated.length()-1));
        System.out.println(s4);
    }
}

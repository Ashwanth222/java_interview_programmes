package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
//
//Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
//
//
//
//Example 1:
//
//Input: s = "abccccdd"
//Output: 7
//Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
//Example 2:
//
//Input: s = "a"
//Output: 1
//Explanation: The longest palindrome that can be built is "a", whose length is 1.
public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "abccccdd";

//        Map<java.lang.String, java.lang.Long> s1 = Arrays.stream(s.split(""))
//                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
//        System.out.println(s1);
//        if(s.length() %2 ==0 ) {
//            Long longestSubstring = s1.values().stream().filter(i -> i % 2 == 0).reduce(0L, (a, b) -> a + b);
//            System.out.println("longest substring is : " + longestSubstring);
//
//        }else {
//            if(s1.values().contains(1)) {
//                Long longestSubstring = s1.values().stream().filter(i -> i % 2 == 0).reduce(1L, (a, b) -> a + b);
//                System.out.println("longest substring is : " + longestSubstring);
//            }else{
//                Long longestSubstring = s1.values().stream().filter(i -> i % 2 == 0).reduce(0L, (a, b) -> a + b);
//                System.out.println("longest substring is : " + longestSubstring);
//            }
//        }
//alternate
        int oddCount = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if (map.get(ch) % 2 == 1)
                oddCount++;
            else
                oddCount--;
        }
        if (oddCount > 1) {
            System.out.println(s.length() - oddCount + 1);
        }else {
            System.out.println(s.length());
        }
    }
}

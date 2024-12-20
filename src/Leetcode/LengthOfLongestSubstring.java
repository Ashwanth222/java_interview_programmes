package Leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String st = "abcdedkl";
        int a_pointer = 0;
        int b_pointer = 0;
        int l = st.length();
        int max = 0;
        Set<Character> string = new HashSet<>();
        while (b_pointer < st.length()) {
            if (!string.contains(st.charAt(b_pointer))) {
                string.add(st.charAt(b_pointer));
                max = Math.max(string.size(), max);
                b_pointer++;
            } else {
                string.remove(st.charAt(b_pointer));
                a_pointer++;
            }
        }
        System.out.println(max);
        System.out.println(string);

        //alternate
        Set<String> set = Arrays.stream(st.split("")).collect(Collectors.toSet());
        System.out.println(set);
        System.out.println(set.size());

        //alternate
        String longestSubstring1 = Arrays.stream(st.split("")).distinct().collect(Collectors.joining(""));
        System.out.println(longestSubstring1);
        System.out.println(longestSubstring1.length());

        //alternate
        String longestSubstring2 = Arrays.stream(st.split("")).distinct().collect(Collectors.joining(""));
        System.out.println(longestSubstring2);
        System.out.println(longestSubstring2.length());

        //alternate
        List<String> longestSubstring3 = Arrays.stream(st.split("")).distinct().collect(Collectors.toList());
        System.out.println(longestSubstring3);
        System.out.println(longestSubstring3.size());

        //alternate
        Set<String> longestSubstring5 = Arrays.stream(st.split("")).distinct().collect(Collectors.toUnmodifiableSet());
        System.out.println(longestSubstring5);
        System.out.println(longestSubstring5.size());

        //alternate
        Map<String, Set<String>> longestSubstring4 = Arrays.stream(st.split("")).collect(Collectors.groupingBy(e -> e, Collectors.toSet()));
        System.out.println(longestSubstring4.values());
        System.out.println(longestSubstring4.values().size());
    }
}

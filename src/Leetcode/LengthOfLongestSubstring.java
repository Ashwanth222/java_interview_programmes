package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String st = "abcdedkl";
        int a_pointer = 0;
        int b_pointer = 0;
        int l = st.length();
        int max = 0;
        Set<Character> string = new HashSet<>();
        while (b_pointer<st.length()) {
            if (!string.contains(st.charAt(b_pointer))) {
                string.add(st.charAt(b_pointer));
                max = Math.max(string.size(), max);
                b_pointer++;
            }else{
                string.remove(st.charAt(b_pointer));
                a_pointer++;
            }
        }
        System.out.println(max);
        System.out.println(string);
    }
}

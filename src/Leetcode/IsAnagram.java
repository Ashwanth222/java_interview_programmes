package Leetcode;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args){
        String s = "abcdef";
        String t = "defcba";
        if (s.length() != t.length()) {
             System.out.println(false);
        }

        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            System.out.println(Arrays.toString(freq));
            freq[t.charAt(i) - 'a']--;
            System.out.println(Arrays.toString(freq));
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                System.out.println(false);
            }
        }

         System.out.println(true);

    }
}

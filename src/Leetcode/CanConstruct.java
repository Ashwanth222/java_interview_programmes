//package Leetcode;
//
//import java.util.Arrays;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//////Given two strings ransomNote and magazine, return true if ransomNote
////// can be constructed by using the letters from magazine and false otherwise.
//////
//////Each letter in magazine can only be used once in ransomNote.
//////
//////
//////
//////Example 1:
//////
//////Input: ransomNote = "a", magazine = "b"
//////Output: false
//////Example 2:
//////
//////Input: ransomNote = "aa", magazine = "ab"
//////Output: false
//////Example 3:
//////
//////Input: ransomNote = "aa", magazine = "aab"
//////Output: true
//public class CanConstruct {
//    public static void main(String[] args){
//        String ransomNote = "aa", magazine = "abc";
//        if (ransomNote.length() > magazine.length()) {
//            System.out.println(false);
//        }else {
//          Map<String,Long> map = Arrays.stream(magazine.split(""))
//                   .collect(Collectors.groupingBy(e->e,Collectors.counting()));
//          map.
//        }
//        //alternate
//        //if (ransomNote.length() > magazine.length()) return false;
//        //        int[] alphabets_counter = new int[26];
//        //
//        //        for (char c : magazine.toCharArray())
//        //            alphabets_counter[c-'a']++;
//        //
//        //        for (char c : ransomNote.toCharArray()){
//        //            if (alphabets_counter[c-'a'] == 0) return false;
//        //            alphabets_counter[c-'a']--;
//        //        }
//        //        return true;
//    }
//}

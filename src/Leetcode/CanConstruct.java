package Leetcode;

import java.util.*;
import java.util.stream.Collectors;

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
public class CanConstruct {
    public static void main(String[] args){

       String ransomNote = "aabc";
       String magazine = "aabcdef";
       String ransomNote1 = Arrays.stream(ransomNote.split("")).sorted().collect(Collectors.joining(""));
       String magazine1 = Arrays.stream(magazine.split("")).sorted().collect(Collectors.joining(""));

        Map<String, Long> map1 =Arrays.stream(ransomNote.split("")).sorted()
                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));
        System.out.println("map1" + map1);

        Map<String, Long> map2 =Arrays.stream(magazine.split("")).sorted()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println("map1" + map2);
        boolean flag = true;

        List<Long> value1 = map1.values().stream().toList();
        List<Long> value2 = map2.values().stream().toList();
        String set1 = map1.keySet().toString();
        System.out.println("set1" + set1);
        String set2 = map2.keySet().toString();
        System.out.println("set2" + set2);
        if(map1.keySet().size() <= map2.keySet().size()) {
            for (int k = 0; k<set1.length()-1; k++) {
                System.out.println("set1.charAt(k)" + set1.charAt(k) + "set2.charAt(k)" + set2.charAt(k));
                if (!Objects.equals(set1.charAt(k),set2.charAt(k))) {
                    System.out.println("can not be constructed");
                    flag = false;
                    break;
                }
            }
        }else {
            flag = false;
            System.out.println("can not be constructed");
        }
        if(flag == true){
            System.out.println("can be constructed");
        }


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
    }
}

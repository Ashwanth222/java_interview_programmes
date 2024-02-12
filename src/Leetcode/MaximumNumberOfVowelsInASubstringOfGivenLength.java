package Leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
//
//Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
//
//
//
//Example 1:
//
//Input: s = "abciiidef", k = 3
//Output: 3
//Explanation: The substring "iii" contains 3 vowel letters.
//Example 2:
//
//Input: s = "aeiou", k = 2
//Output: 2
//Explanation: Any substring of length 2 contains 2 vowels.
//Example 3:
//
//Input: s = "leetcode", k = 3
//Output: 2
//Explanation: "lee", "eet" and "ode" contain 2 vowels
public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public static void main(String[] args){
      String  s = "abciiidef";
      int k = 3;
        Set<Character> characterSet = new HashSet<>();
        characterSet.add('a');
        characterSet.add('e');
        characterSet.add('i');
        characterSet.add('o');
        characterSet.add('u');
      List<String> integers = Arrays.stream(s.split("")).collect(Collectors.toList());
      for(int i = 3;i<s.length();i=i+3){
          if(s.contains(s.substring(0,i))){

          }
      }
    }
}

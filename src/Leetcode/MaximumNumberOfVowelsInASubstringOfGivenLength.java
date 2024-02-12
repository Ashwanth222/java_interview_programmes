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
      String  s = "abciifeee";
      int k = 3;
       int  maxCount =0;
        Set<Character> characterSet = new HashSet<>();
        characterSet.add('a');
        characterSet.add('e');
        characterSet.add('i');
        characterSet.add('o');
        characterSet.add('u');
        int vowelsCount=0;
        int initialValue =0;
        int maxValue = 0;
      List<String> integers = Arrays.stream(s.split("")).collect(Collectors.toList());
      for(int i = 0;i<s.length();i++){
          if(characterSet.contains(s.charAt(i))){
              vowelsCount = vowelsCount+1;
          }
      }
        for(int i = 0;i<s.length()-2;i=i+3){
           String sub = s.substring(i,i+3);
           for(int j =0;j<sub.length();j++) {
              if(characterSet.contains(sub.charAt(j)) && vowelsCount != 0) {
                  maxCount = maxCount + 1;
                  vowelsCount = vowelsCount - 1;
                  maxValue = Math.max(maxValue, maxCount);
              }
           }
           maxCount = 0;
        }
      System.out.println("vowelsCount" + vowelsCount);
      System.out.println("maxValue"+maxValue);

      //alternate
        int max=0;
        int c=0;
        for(int i=0;i<k;i++){
            if(isvowel(s.charAt(i)))
                c++;
        }
        max=c;
        for(int i=k;i<s.length();i++){
            if(isvowel(s.charAt(i))){
                c++;
            }
            if(isvowel(s.charAt(i-k))){
                c--;
            }
            max=Math.max(max,c);
        }
        System.out.println( max);


    }

    private static boolean isvowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

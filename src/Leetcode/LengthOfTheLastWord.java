package Leetcode;

import java.util.Arrays;

//. Length of Last Word
//Easy
//4.5K
//236
//Companies
//Given a string s consisting of words and spaces, return the length of the last word in the string.
//
//A word is a maximal
//substring
// consisting of non-space characters only.
//
//
//
//Example 1:
//
//Input: s = "Hello World"
//Output: 5
//Explanation: The last word is "World" with length 5.
//Example 2:
//
//Input: s = "   fly me   to   the moon  "
//Output: 4
//Explanation: The last word is "moon" with length 4.
//Example 3:
//
//Input: s = "luffy is still joyboy"
//Output: 6
//Explanation: The last word is "joyboy" with length 6
public class LengthOfTheLastWord {
    public static void main(String[] args){
        String s = "  fly   me  to the  moon  ";
       String s1 = Arrays.stream(s.trim().replace("  "," ")
               .split(" ")).skip(s.trim().replace("  "," ").split(" ").length - 1).findFirst().get();
        System.out.println(s1);
    }
}

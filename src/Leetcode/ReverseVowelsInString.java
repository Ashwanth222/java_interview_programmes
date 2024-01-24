package Leetcode;

import java.util.ArrayList;
import java.util.List;

//Reverse Vowels of a String
//Easy
//4.3K
//2.7K
//Companies
//Given a string s, reverse only all the vowels in the string and return it.
//
//The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
//
//
//
//Example 1:
//
//Input: s = "hello"
//Output: "holle"
//Example 2:
//
//Input: s = "leetcode"
//Output: "leotcede
public class ReverseVowelsInString {
    public static void main(String[] args){
        String s = "leetcode";
        String regex = "[AEIOUaeiou]";
        String r = s.replaceAll(regex,"?");
        System.out.println(r);
        List<Character> ch = new ArrayList<>();
       // String[] c = s.split("");
        for(int i = 0; i<s.length();i++){
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                ch.add(s.charAt(i));
            }
        }
        System.out.println("ch: " + ch.toString());
       String sk = ch.toString();
       StringBuffer sb = new StringBuffer(sk).reverse();
       System.out.println("sb: "+ sb);
        List<Character> ch1 = new ArrayList<>();
        int f = ch.size()-1;
        for(int i = 0; i<s.length();i++) {
            if(r.charAt(i) == '?'){
                ch1.add(ch.get(f));
                f--;
            }else {
                ch1.add(r.charAt(i));
            }
        }
        System.out.println(ch1.toString());
    }
}

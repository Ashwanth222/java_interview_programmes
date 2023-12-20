package Leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Example 1:
//
//Input: chars = ["a","a","b","b","c","c","c"]
//Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
//Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
//Example 2:
//
//Input: chars = ["a"]
//Output: Return 1, and the first character of the input array should be: ["a"]
//Explanation: The only group is "a", which remains uncompressed since it's a single character.
//Example 3:
//
//Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
//Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
//Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
public class CompressCharLengthToString {
    public static void main(String[] args){
        char[] chars = {'a','a','b','b','c','c','c', 'c','c','a','a','b'};
        int l = chars.length;
        Map<Character,Integer> cha = new HashMap<>();
        for(char ch: chars){
           if(cha.containsKey(ch)){
               cha.put(ch,cha.get(ch)+1);
           }else{
               cha.put(ch,1);
           }
        }
        System.out.println(cha);
        List<Character> keys = cha.entrySet().stream().map(e->e.getKey()).collect(Collectors.toList());
        List<Integer> values = cha.entrySet().stream().map(e->e.getValue()).collect(Collectors.toList());
        System.out.println(keys);
        System.out.println(values);
        String tstr = "";
        for(int i = 0; i<=cha.size()-1;i++) {
          String str =  keys.get(i).toString() + values.get(i).toString();
           tstr = tstr+ str;
        }
        System.out.println(tstr);
    }
//      public int compress(char[] chars) {
//        int n = chars.length;
//        StringBuilder sb = new StringBuilder();
//
//        int freq = 1;
//
//        for (int i = 0; i < n; i++) {
//            char c = chars[i];
//
//            while (i < n - 1 && chars[i] == chars[i + 1]) {
//                freq++;
//                i++;
//            }
//
//            sb.append(c);
//
//            if (freq > 1) {
//                sb.append(freq);
//            }
//
//            freq = 1;
//        }
//
//        String compressedStr = sb.toString();
//        char[] compressedChars = compressedStr.toCharArray();
//
//        for (int i = 0; i < compressedChars.length; i++) {
//            chars[i] = compressedChars[i];
//        }
//
//        return compressedChars.length;
//    }
}

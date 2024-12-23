package Leetcode;

import java.util.*;
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
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c', 'c', 'c', 'a', 'a', 'b','d','e','e','e'};
        int l = chars.length;
        Map<Character, Integer> cha = new HashMap<>();
        for (char ch : chars) {
            if (cha.containsKey(ch)) {
                cha.put(ch, cha.get(ch) + 1);
            } else {
                cha.put(ch, 1);
            }
        }
        System.out.println(cha);
        List<Character> keys = cha.entrySet().stream().map(e -> e.getKey()).collect(Collectors.toList());
        List<Integer> values = cha.entrySet().stream().map(e -> e.getValue()).collect(Collectors.toList());
        System.out.println(keys);
        System.out.println(values);
        String tstr = "";
        for (int i = 0; i <= cha.size() - 1; i++) {
            String str = keys.get(i).toString() + values.get(i).toString();
            tstr = tstr + str;
        }
        System.out.println(tstr);

        //alternate
        //even if 1 is present

        StringBuffer sb3 = new StringBuffer();
        for(int i = 0; i<=cha.size()-1;i++) {
            sb3.append(keys.get(i)).append(values.get(i));
        }
        System.out.println("sb3" + sb3);


        //alternate
        StringBuffer sb = new StringBuffer();
        Set<Character> str =  cha.keySet();
        for (Character ch: str) {
            System.out.println("ch" + ch);
            if(cha.get(ch) >1)
                sb.append(ch).toString().concat(sb.append(cha.get(ch)).toString());
            else
                sb.append(ch).toString();
        }
        System.out.println("sb" + sb);

        //alternate
        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c', 'c', 'c', 'a', 'a', 'b', 'd', 'e', 'e', 'e'};
        String b = new String(chars1);
        System.out.println(b);
        StringBuffer sb2 = new StringBuffer();
        Map<String, Long> map = Arrays.stream(b.split("")).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(map);
        Set<String> keys1 = map.keySet();
        List<Long> values1 = map.values().stream().collect(Collectors.toList());
        map.entrySet().forEach(e -> {
            if(e.getValue() !=1) {
                sb2.append(e.getKey() + e.getValue());
            }
        else {
                    sb2.append(e.getKey());
                }
        }

        );
        System.out.println("sb2  " + sb2);
        System.out.println("sb2  " + sb2.length());
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

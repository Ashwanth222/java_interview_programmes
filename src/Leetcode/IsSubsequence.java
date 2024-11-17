package Leetcode;

import java.util.Arrays;

//Example 1:
//
//Input: s = "abc", t = "ahbgdc"
//Output: true
//Example 2:
//
//Input: s = "axc", t = "ahbgdc"
//Output: false
public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abe";
        String t = "ahbgde";
        int count = -1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    System.out.println("s.charAt(i)" + s.charAt(i));
                    System.out.println("t.charAt(j)" + t.charAt(j));
                    count = count + 1;
                }
//              if(Arrays.stream(s.split("")).skip(i+1).findFirst()
//                      .equals(Arrays.stream(t.split("")).skip(j+1).findFirst())){
//                  count = count +1;
//              }
            }
        }
        if (s.length() - 1 == count) {
            System.out.println(count + "is a subsequence");
        } else {
            System.out.println(count + "is not a subsequence");
        }

        //alternate
        String a = "abef";
        String b = "ahbgde";

        //input 2
//        String a = "abe";
//        String b = "ahbgde";
//
        //input 3
//        String a = "abef";
//        String b = "ahgde";
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        int j = 0;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ch2.length && j < ch1.length; i++) {
            if ((ch2[i] == ch1[j])) {
                sb.append(ch2[i]);
                j++;
            }
        }
        System.out.println("sb  " + sb);
        System.out.println(a.length() == sb.length());


        //  int n1 = s.length();
        //        int n2 = t.length();
        //
        //        if(n1<1) return true;
        //        int i=0;
        //        int j=0;
        //
        //        while(i<n2){
        //            if(t.charAt(i)==s.charAt(j)){
        //                j++;
        //            }
        //            i++;
        //            if(j==n1) return true;
        //        }
        //        return false;
    }
}

package Leetcode;
//Is Subsequence
//Easy
//9.2K
//499
//Companies
//Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
//
//A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
//
//
//
//Example 1:
//
//Input: s = "abc", t = "ahbgdc"
//Output: true
//Example 2:
//
//Input: s = "axc", t = "ahbgdc"
//Output: false
public class IsSubsequencee {
    public static void main(String[] args){
       String s = "abcl", t = "ahbgkcdl";
//       int count = 0;
//       int temp = 0;
//       int sCount = s.length();
//       for(int i = 0; i<s.length();i++){
//           for(int j= i ; j<t.length();j++){
//               if(s.charAt(i) == t.charAt(j)  ){
//                   count ++;
//                   if(i>j){
//                       i = j;
//                   }
//                   if(i > s.length()-1){
//                       break;
//                   }
//
//
//               }
//           }
//       }
//       if(count == sCount){
//           System.out.println("It is a subsequence");
//       }else{
//           System.out.println("is not a subsequence");
//       }

        int i=0;

        for(int j=0;j<t.length() && i<s.length();j++)
            if(t.charAt(j) == s.charAt(i))
                i++;
        System.out.println( i == s.length());


    }
}

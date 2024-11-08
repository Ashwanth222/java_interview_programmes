//package Leetcode;
//
//import java.util.HashSet;
//
//// Split a String Into the Max Number of Unique Substrings
////Medium
////Topics
////Companies
////Hint
////Given a string s, return the maximum number of unique substrings that the given string can be split into.
////
////You can split string s into any list of non-empty substrings, where the concatenation of the substrings forms the original string. However, you must split the substrings such that all of them are unique.
////
////A substring is a contiguous sequence of characters within a string.
////
////
////
////Example 1:
////
////Input: s = "ababccc"
////Output: 5
////Explanation: One way to split maximally is ['a', 'b', 'ab', 'c', 'cc']. Splitting like ['a', 'b', 'a', 'b', 'c', 'cc'] is not valid as you have 'a' and 'b' multiple times.
////Example 2:
////
////Input: s = "aba"
////Output: 2
////Explanation: One way to split maximally is ['a', 'ba'].
////Example 3:
////
////Input: s = "aa"
////Output: 1
////Explanation: It is impossible to split the string any further.
//public class SplitAStringIntoTheMaxNumberOfUniqueSubstrings {
//
//    public static void main(String[] args) {
//        String s = "ababccc";
//        int start = 0;
//        HashSet<String> seen = new HashSet<>();
//        private static void backtrack(int end, String s, Set<String> seen = new HashSet<>()) {
//            if (start == s.length()) {
//                System.out.println(0);
//            }
//            int maxSplits = 0;
//            for ( end = start + 1; end <= s.length(); end++) {
//                String substring = s.substring(start, end);
//                if (!seen.contains(substring)) {
//                    seen.add(substring);
//                    maxSplits = Math.max(maxSplits, 1 + backtrack(end, s, seen));
//                    seen.remove(substring);
//                }
//            }
//            System.out.println(maxSplits);
//        }
//        }
//
//}
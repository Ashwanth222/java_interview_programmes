package Leetcode;

//The encoding rule is: k[encoded_string], where the encoded_string inside the square
// brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
//
//You may assume that the input string is always valid; there are no extra white spaces,
//
//square brackets are well-formed, etc. Furthermore, you may assume that the original
// data does not contain any digits and that digits are only for those repeat numbers, k.
// For example, there will not be input like 3a or 2[4].
//
//The test cases are generated so that the length of the output will never exceed 105.
//
//
//
//Example 1:
//
//Input: s = "3[a]2[bc]"
//Output: "aaabcbc"
//Example 2:
//
//Input: s = "3[a2[c]]"
//Output: "accaccacc"
//Example 3:
//
//Input: s = "2[abc]3[cd]ef"
//Output: "abcabccdcdcdef"
//

//'0' - '0' = 48 - 48 = 0
//'1' - '0' = 49 - 48 = 1
//'2' - '0' = 50 - 48 = 2

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args){
        String s = "2[abc]3[cd]ef";
        Stack<Integer> st = new Stack<>();
        Stack<StringBuilder> st1 = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
            } else if (c == '[') {
                st.push(n);
                n = 0;
                st1.push(sb);
                sb = new StringBuilder();
            } else if (c == ']') {
                int k = st.pop();
                StringBuilder temp = sb;
                sb = st1.pop();
                while (k-- > 0) {
                    sb.append(temp);
                }
            } else {
                sb.append(c);
            }
        }

        System.out.println(sb.toString());
    }
}

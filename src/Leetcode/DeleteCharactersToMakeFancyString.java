package Leetcode;

//Delete Characters to Make Fancy String
//Easy
//Topics
//Companies
//Hint
//A fancy string is a string where no three consecutive characters are equal.
//
//Given a string s, delete the minimum possible number of characters from s to make it fancy.
//
//Return the final string after the deletion. It can be shown that the answer will always be unique.
//
//
//
//Example 1:
//
//Input: s = "leeetcode"
//Output: "leetcode"
//Explanation:
//Remove an 'e' from the first group of 'e's to create "leetcode".
//No three consecutive characters are equal, so return "leetcode".
//Example 2:
//
//Input: s = "aaabaaaa"
//Output: "aabaa"
//Explanation:
//Remove an 'a' from the first group of 'a's to create "aabaaaa".
//Remove two 'a's from the second group of 'a's to create "aabaa".
//No three consecutive characters are equal, so return "aabaa".
//Example 3:
//
//Input: s = "aab"
//Output: "aab"
//Explanation: No three consecutive characters are equal, so return "aab".
public class DeleteCharactersToMakeFancyString {
    public static void main(String[] args){
        String s = "leeetcode";
            StringBuilder result = new StringBuilder();
            for (char c : s.toCharArray()) {
                int n = result.length();
                if (n < 2 || !(result.charAt(n - 1) == c && result.charAt(n - 2) == c)) {
                    result.append(c);
                }
            }
           System.out.println(result.toString());

            //alternate
        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0));
        int n = s.length(), cnt = 1;
        for (int i = 1; i < n; i++) {
//            System.out.println(s.charAt(i));
//            System.out.println(ans.charAt(ans.length() - 1));
            if (s.charAt(i) == ans.charAt(ans.length() - 1)) {
                cnt++;
                if (cnt < 3) {
                    ans.append(s.charAt(i));
                }
            } else {
                cnt = 1;
                ans.append(s.charAt(i));
            }
        }
        System.out.println(ans);
    }
}
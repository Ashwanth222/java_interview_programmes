package Leetcode;
//
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Map;
//import java.util.Set;
//
//////Given a string str, the task is to find the longest substring which is a palindrome.
//////
//////Examples:
//////
//////Input: str = “forgeeksskeegfor”
//////Output: “geeksskeeg”
//////Explanation: There are several possible palindromic substrings like “kssk”, “ss”, “eeksskee” etc.
//////But the substring “geeksskeeg” is the longest among all.
public class LongestPalindromeSubstring {
    public static void main(String[] args){
        String str = "ttkjfogeeksskeegofgjkglk";
        //String str = "geeksskeeg";
        // Output: “geeksskeeg”
        int a_pointer = str.indexOf(str.charAt(0));
        int b_pointer = str.lastIndexOf(str.charAt(str.length()-1));
        StringBuffer sb = new StringBuffer();
        while(a_pointer<b_pointer){
            if(str.charAt(a_pointer) == str.charAt(b_pointer)){
                sb.append(str.charAt(a_pointer));
                a_pointer++;
                b_pointer--;
            } else if (str.charAt(a_pointer) != str.charAt(b_pointer)){
                    sb.setLength(0);
                    b_pointer--;
                if(str.charAt(a_pointer) == str.charAt(b_pointer)){
                    sb.append(str.charAt(a_pointer));
                    a_pointer++;
                    b_pointer--;
                }else if (str.charAt(a_pointer++) == str.charAt(b_pointer)){
                    sb.append(str.charAt(a_pointer));
                    a_pointer++;
                }
            }
        }
        System.out.println(sb.toString().concat(sb.reverse().toString()));
//        int left = 0;
//        int maxLength=0;
//        Set<Character> st = new HashSet<>();
//        for(int right = 0; right<str.length();right++){
//            if(!st.contains(str.charAt(right))){
//                st.add(str.charAt(right));
//                maxLength=Math.max(maxLength,right-left+1);
//            }else{
//                while(str.charAt(left)!=str.charAt(right)) {
//                    st.remove(left);
//                    left++;
//                }
//                st.remove(str.charAt(left));left++;
//                st.add(str.charAt(right));
//            }
//        }
//        System.out.println(st);
//        System.out.println(maxLength);

//
//        //alternate
//        Set<Character>set=new HashSet<>();
//        int maxLength1=0;
//        int left1=0;
//        String s = "forgeeksskeegfor";
//        for(int right=0;right<s.length();right++){
//
//            if(!set.contains(s.charAt(right))){
//                set.add(s.charAt(right));
//                maxLength1=Math.max(maxLength1,right-left1+1);
//
//            }else{
//                while(s.charAt(left1)!=s.charAt(right)){
//                    set.remove(s.charAt(left1));
//                    left1++;
//                }
//                set.remove(s.charAt(left1));left1++;
//                set.add(s.charAt(right));
//            }
//
//        }
//        System.out.println(set);
//        System.out.println(maxLength1);
    }
}

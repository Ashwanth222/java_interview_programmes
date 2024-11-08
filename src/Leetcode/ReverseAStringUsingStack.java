package Leetcode;

import java.util.Stack;

public class ReverseAStringUsingStack {
    public static void main(String[] args){
        String str1 = "GeeksForGeeks";
        Stack<Character> stack = new Stack<>();
        char[] chars = str1.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(char ch:chars){
            stack.push(ch);
        }
        for(char ch:chars){
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }
}

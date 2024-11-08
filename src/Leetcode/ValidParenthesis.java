package Leetcode;

import java.util.Stack;

//Valid Parentheses in an Expression
//Last Updated : 16 Sep, 2024
//Given an expression string s, write a program to examine whether the pairs and
// the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in the given expression.
//
//Example:
//
//Input: s = “[()]{}{[()()]()}”
//Output: true
//Explanation: All the brackets are well-formed
//
//
//Input: s = “[(])”
//Output: false
//Explanation: 1 and 4 brackets are not balanced because
//there is a closing ‘]’ before the closing ‘(‘

//Step-by-step approach:
//
//Declare a character stack (say temp).
//Now traverse the string exp.
//If the current character is a starting bracket ( ‘(‘ or ‘{‘  or ‘[‘ ) then push it to stack.
//If the current character is a closing bracket ( ‘)’ or ‘}’ or ‘]’ )
// then pop from the stack and if the popped character is the matching starting bracket then fine.
//Else brackets are Not Balanced.
//After complete traversal, if some starting brackets are left in the stack then the expression
// is Not balanced, else Balanced.
public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "[()]{[[}{[()()]()}";
        Stack<Character> stack = new Stack<>();
        System.out.println("stack starting" + stack);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
                System.out.println("stack inside if" + stack);
            } else {
                if (!stack.empty() || (s.charAt(i) == '}' && stack.peek() == '{')
                        || (s.charAt(i) == ')' && (stack.peek() == ')') ||
                        (s.charAt(i) == ']' && stack.peek() == ']'))) {
                    stack.pop();
                    System.out.println("stack in else popping" + stack);
                } else {
                    System.out.println("not a valid parenthesis");
                }
            }
        }
        System.out.println(stack);
        if (stack.empty()) {
            System.out.println("valid parenthesis");
        } else {
            System.out.println("not a valid parenthesis");
        }
    }
}

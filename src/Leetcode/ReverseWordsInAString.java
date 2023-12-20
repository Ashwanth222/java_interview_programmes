package Leetcode;

public class ReverseWordsInAString {
    public static void main(String[] args){
        String s1 = "hi how are you?";

        String[] s = s1.split(" ");
        String reverseString = "";
        for(int i = s.length-1; i>=0; i--){
            reverseString = reverseString + " " + s[i];
        }
        System.out.println(reverseString);
    }
}

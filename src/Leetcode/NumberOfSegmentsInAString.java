package Leetcode;

//Given a string s, return the number of segments in the string.
//
//A segment is defined to be a contiguous sequence of non-space characters.
//
//
//
//Example 1:
//
//Input: s = "Hello, my name is John"
//Output: 5
//Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
//Example 2:
//
//Input: s = "Hello"
//Output: 1
public class NumberOfSegmentsInAString {
    public static void main(String[] args){
        String s = "hello world";
        if(s == "")
            System.out.println("no segments");
        else {
            int l = s.split(" ").length;
            System.out.println(l);
        }

        //alternate

        String[] words = s.split(" ");
        int count = 0;

        // Count non-empty words
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }

        System.out.println( count);
    }
}

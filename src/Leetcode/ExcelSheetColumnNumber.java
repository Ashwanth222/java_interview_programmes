package Leetcode;

//column title as appears in an Excel sheet, return its corresponding column number.
//
//For example:
//
//A -> 1
//B -> 2
//C -> 3
//...
//Z -> 26
//AA -> 27
//AB -> 28
//...
//
//
//Example 1:
//
//Input: columnTitle = "A"
//Output: 1
//Example 2:
//
//Input: columnTitle = "AB"
//Output: 28
//Example 3:
public class ExcelSheetColumnNumber {
    public static void main(String[] args){
        String s = "AB";
        int s1 = 0;
        for(int i = 0;i<s.length();i++) {
            System.out.println(s.charAt(i));
            s1 = s1 + s.charAt(i) -64;
        }
        System.out.println(s1);
    }
}

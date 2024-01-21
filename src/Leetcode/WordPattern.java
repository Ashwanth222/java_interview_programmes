package Leetcode;

//290. Word Pattern
//Easy
//7K
//933
//Companies
//Given a pattern and a string s, find if s follows the same pattern.
//
//Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
//
//
//
//Example 1:
//
//Input: pattern = "abba", s = "dog cat cat dog"
//Output: true
//Example 2:
//
//Input: pattern = "abba", s = "dog cat cat fish"
//Output: false
//Example 3:
//
//Input: pattern = "aaaa", s = "dog cat cat dog"
//Output: false
public class WordPattern {
    public static void main(String[] args){
      String pattern = "abba";
      String s = "dog cat cat dog";
//      char[] c =pattern.toCharArray();
//      System.out.println(c);
    //  String[] s1 = s.split(" ");
    String s2 = s.replace("dog","a");
        System.out.println(s2);
    String s3 =  s2.replace("cat", "b");
        System.out.println(s3);
    String s4 =  s3.replace(" ","");
        System.out.println(s4);
      if(pattern.equals(s4)){
          System.out.println("true");
      }else{
          System.out.println("false");

      }
      //we can do with replaceAll also


    }
}

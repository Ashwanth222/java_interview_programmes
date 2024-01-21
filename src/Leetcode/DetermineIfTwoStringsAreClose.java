package Leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;
//Example 1:
//
//Input: word1 = "abc", word2 = "bca"
//Output: true
//Explanation: You can attain word2 from word1 in 2 operations.
//Apply Operation 1: "abc" -> "acb"
//Apply Operation 1: "acb" -> "bca"
//Example 2:
//
//Input: word1 = "a", word2 = "aa"
//Output: false
//Explanation: It is impossible to attain word2 from word1, or vice versa, in any number of operations.
//Example 3:
//
//Input: word1 = "cabbba", word2 = "abbccc"
//Output: true
//Explanation: You can attain word2 from word1 in 3 operations.
//Apply Operation 1: "cabbba" -> "caabbb"
//Apply Operation 2: "caabbb" -> "baaccc"
//Apply Operation 2: "baaccc" -> "abbccc"
//

//need to add more code
public class DetermineIfTwoStringsAreClose {
    public static void main(String[] args){
      String  word1 = "abc";
      String word2 = "bca";
      boolean flag = true;
        Arrays.sort(word1.toCharArray());
        Arrays.sort(word2.toCharArray());
       String str1 = Arrays.stream(word1.split("")).sorted().distinct().collect(Collectors.joining());
       String str2 = Arrays.stream(word2.split("")).sorted().distinct().collect(Collectors.joining());
       System.out.println(str1);
       System.out.println(str2);
       String str = str1.length()>str2.length()?str1:str2;
        if(str1.length() != str2.length()){
           System.out.println("two strings are not equal");
       }else{
           for(int i = 0; i<str.length();i++){
               if(str1.charAt(i) != str2.charAt(i)){
                   flag = !flag;
                   break;
               }
           }
            if(!flag){
                System.out.println("two strings are not equal");
            }else{
                System.out.println("two strings are equal");
            }
       }
    }
}

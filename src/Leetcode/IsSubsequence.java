package Leetcode;

import java.util.Arrays;

//Example 1:
//
//Input: s = "abc", t = "ahbgdc"
//Output: true
//Example 2:
//
//Input: s = "axc", t = "ahbgdc"
//Output: false
public class IsSubsequence {
    public static void main(String[] args){
       String s = "abe";
       String t = "ahbgde";
       int count = -1;
       for(int i = 0;i<s.length();i++){
          for(int j = i;j<t.length();j++){
              if(s.charAt(i) == t.charAt(j)){
                  System.out.println("s.charAt(i)" + s.charAt(i));
                  System.out.println("t.charAt(j)" + t.charAt(j));
                  count = count +1;
              }
//              if(Arrays.stream(s.split("")).skip(i+1).findFirst()
//                      .equals(Arrays.stream(t.split("")).skip(j+1).findFirst())){
//                  count = count +1;
//              }
          }
       }if(s.length()-1 == count) {
            System.out.println(count + "is a subsequence");
        }else{
           System.out.println(count + "is not a subsequence");
        }
       //  int n1 = s.length();
        //        int n2 = t.length();
        //
        //        if(n1<1) return true;
        //        int i=0;
        //        int j=0;
        //
        //        while(i<n2){
        //            if(t.charAt(i)==s.charAt(j)){
        //                j++;
        //            }
        //            i++;
        //            if(j==n1) return true;
        //        }
        //        return false;
    }
}

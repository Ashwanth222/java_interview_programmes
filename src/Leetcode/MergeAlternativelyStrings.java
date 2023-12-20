package Leetcode;

public class MergeAlternativelyStrings {
    public static void main(String[] args){
        String s1 = "Hi how are you";
        String s2 = "Hi how are you you you";
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while(i<s1.length() || i<s2.length()){
            if(i <s1.length()) {
                sb.append(s1.charAt(i));
            }
            if(i <s2.length()) {
                sb.append(s2.charAt(i));
            }
            i++;
        }
        System.out.println(sb);
    }
}

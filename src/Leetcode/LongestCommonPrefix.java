package Leetcode;

public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] strings = {"flower", "flow", "flight" };
        String prefix = strings[0];
        for(int i =1; i<strings.length;i++){
            while(strings[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        System.out.println("prefix  : " + prefix);
    }
}

package Leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] string = {"flower", "flow", "flight" };
        String[] strings = {"flower", "flow", "flight" };

        Arrays.sort(string);

        String first = string[0];
        String last = string[string.length-1];
        int g = 0;
        int index = 0;
        while (g<first.length() && g< last.length()){
            if(first.charAt(g) == last.charAt(g)){
                index ++;
                g++;
            }else {
                break;
            }
        }
        System.out.println(first.substring(0,index));

        //alternate 2
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strings);
        String firstt = string[0];
        String lastt = string[string.length-1];
        for(int i =0; i<strings.length;i++) {
            if(firstt.charAt(i) != lastt.charAt(i)){
                System.out.println(ans.toString());
                }else {
                ans.append(first.charAt(i));
            }
        }
        System.out.println("ans : "+ ans);

            //alternate 3
        String prefix = strings[0];
        for(int i =1; i<strings.length;i++){
            while(strings[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        System.out.println("prefix  : " + prefix);

    }
}

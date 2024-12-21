package Java8_programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOccurenceOfEachCharacterInString {
    public static void main(String[] args){
        String str = "aaaaabbbccaab";
        // output = 5a3b2c2a1b
        long count = 1;
        int l = str.length()-1;

        Map<Character,Long> map = new HashMap<>();
        List<Character> st = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for(int i = 1; i<str.length();i++){
            if(str.charAt(i-1) != str.charAt(i)) {
                st.add(str.charAt(i - 1));
                sb.append(count);
                sb.append(str.charAt(i - 1));
                count = 1;
            }
           else{
                count = count +1;
            }
        }
        sb.append(count);
        sb.append(str.charAt(l));
        System.out.println(l);
        System.out.println(st);
        System.out.println(map);
        System.out.println(sb);
    }
}

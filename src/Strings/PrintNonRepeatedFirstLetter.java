package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintNonRepeatedFirstLetter {
    public static void main(String[] args){
        String s = "shiva krishna";
        for(int i = 0; i<s.length();i++){
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                System.out.println("this is the first non repeated character : " + s.charAt(i));
                break;
            }
        }

        //alternate
        String str = "shiva krishna";

        Map<Character, Integer> map = new LinkedHashMap<>();

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find first non-repeated character
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First Non-Repeated Character: "
                        + entry.getKey());
                break;
            }
        }
    }
}

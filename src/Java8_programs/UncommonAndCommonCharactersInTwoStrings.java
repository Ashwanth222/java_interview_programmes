package Java8_programs;

import java.util.HashSet;
import java.util.Set;

public class UncommonAndCommonCharactersInTwoStrings {
    public static void main(String[] args){
        String a = "abcdelkj";
        char[] ch1 = a.toCharArray();
        String b = "bdacxvbe";
        char[] ch2 = b.toCharArray();
        Set<Character> allCharacters = new HashSet<>();
        StringBuffer uncommon = new StringBuffer();
        for(char c1: ch1){
            if(b.indexOf(c1) >=0){
                allCharacters.add(c1);
            }else{
                uncommon.append(c1);
            }
        }
        for(char c2: ch2){
            if(a.indexOf(c2) >=0){
                allCharacters.add(c2);
            }else{
                uncommon.append(c2);
            }
        }
        System.out.println("uncommon characters in both the strings: " + uncommon);
        System.out.println("common characters in both the strings: " +allCharacters);
    }
}

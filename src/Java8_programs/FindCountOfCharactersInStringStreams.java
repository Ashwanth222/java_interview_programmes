package Java8_programs;

import java.util.HashMap;
import java.util.Map;

public class FindCountOfCharactersInStringStreams {
    public static void main(String[] args){

        String s1 = "JAVAEELLKK";
        int l = s1.length();
        char[] ch = s1.toCharArray();
        Map<Character,Integer> dCharactersCount = new HashMap<>();
        for(char c :ch){
            if(dCharactersCount.containsKey(c)){
                dCharactersCount.put(c,dCharactersCount.get(c)+1);
            }else{
                dCharactersCount.put(c,1);
            }
        }
        dCharactersCount.entrySet().stream().forEach(System.out::println);

    }
}

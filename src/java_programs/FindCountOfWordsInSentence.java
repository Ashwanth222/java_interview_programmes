package java_programs;

import java.util.HashMap;
import java.util.Map;

public class FindCountOfWordsInSentence {
    public static void main(String[] args){
        String str = "Hello Good Evening Hello HI";

        // output - {"Hello"=1, "Good"=1, "Evening"=1}

        String[] st = str.split(" ");
        Map<String, Integer> stringCount = new HashMap();
        for(String s: st){
            if(stringCount.get(s) == null ){
                stringCount.put(s,1);
                //System.out.println(stringCount.get(i));
            }else{
                stringCount.put(s, stringCount.get(s) +1);
            }
        }
        System.out.println(stringCount);

        //alternate
        Map<String, Integer> strings = new HashMap<>();
        for(String s : st){
            if(!strings.containsKey(s)){
                strings.put(s,1);
            }else{
                strings.put(s, strings.get(s)+1);
            }
        }
        System.out.println(strings);
    }
}

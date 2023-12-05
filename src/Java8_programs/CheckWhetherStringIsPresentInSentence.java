package Java8_programs;

import java.util.Arrays;

public class CheckWhetherStringIsPresentInSentence {
    public static void main(String[] args){
        String str = "Hi my name is name and i am living in living and i used to do something";
        String string1 = "name";
        boolean thereOrNot = Arrays.stream(str.split(" ")).anyMatch(word ->word.contains(string1));
        System.out.println(thereOrNot);
    }
}

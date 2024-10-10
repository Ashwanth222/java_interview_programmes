package Java8_programs;

import java.util.Arrays;

public class CheckWhetherStringIsPresentInSentence {
    public static void main(String[] args){
        String str = "Hi my name is name and i am living in living and i used to do something";
        String string1 = "name";
        String string2 = "name1";
        boolean thereOrNot = Arrays.stream(str.split(" ")).anyMatch(word ->word.equals(string1));
        System.out.println(thereOrNot);

       boolean h =str.contains(string1);
       System.out.println(h);

        boolean l =str.contains(string2);
        System.out.println(l);
    }
}

package Java8_programs;

//In the below program We will be adding “#“ and “#” as a prefix and suffix in the string.

import java.util.StringJoiner;

public class AddPredixAndSuffix {
    public static void main(String[] args){
        StringJoiner sj = new StringJoiner("," , "#" ,"#");
        sj.add("Hi Hello How are you?");
        sj.add("skjflk");
        sj.add("uyfyvjb");
        System.out.println(sj);

        StringJoiner sj1 = new StringJoiner(",");
        sj1.add("abc");
        sj1.add("def");
        sj1.add("ghi");
        System.out.println(sj1);
    }
}

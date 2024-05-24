package Regex;

import java.util.regex.Pattern;

public class PatternCompile1 {
    public static void main(String[] args){
        // create a REGEX String
        String REGEX = "brave";

        // create the string
        // in which you want to search
        String actualString
                = "Cat is cute";

        // compile the regex to create pattern
        // using compile() method
        Pattern pattern = Pattern.compile(REGEX);

        // check whether Regex string is
        // found in actualString or not
        boolean matches = pattern
                .matcher(actualString)
                .matches();

        System.out.println("actualString "
                + "contains REGEX = "
                + matches);
    }
}

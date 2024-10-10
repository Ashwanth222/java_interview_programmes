package Regex;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PatterCompile {
    public static void main(String[] args)
    {
        // create a REGEX String
        String REGEX = ".*www.*";

        String regex="\\d+";

        // create the string
        // in which you want to search
        String actualString
                = "www.geeksforgeeks.org";
        String str="str23wello27";

        // compile the regex to create pattern
        // using compile() method
        Pattern pattern = Pattern.compile(REGEX);
        Pattern pattern1= Pattern.compile("\\d+");

        // get a matcher object from pattern
        Matcher matcher = pattern.matcher(actualString);
        Matcher matcher1=pattern1.matcher(str);

        //List<String> s = Arrays.stream(str.replaceAll("[a-zA-Z]", "").);
             //  .mapToInt(Integer::parseInt).skip(1).reduce(0, (a,b) -> a+b);
       // System.out.println(s);
        int i=0;
        int j=0;
        while(matcher1.find()){
             i= Integer.parseInt(matcher1.group());

            System.out.println(i);
        }

        // check whether Regex string is
        // found in actualString or not
        boolean matches = matcher.matches();

        System.out.println("actualString "
                + "contains REGEX = "
                + matches);
    }
}

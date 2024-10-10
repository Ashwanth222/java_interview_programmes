package Strings.StringToIntegerUsingInteger;

public class IntegerToString {
    public static void main(String[] args)
    {
        String s = "2015";

        int i = Integer.parseInt(s);

        String s1 = String.valueOf(i);

        System.out.println(s1);          //Output : 2015
    }
}

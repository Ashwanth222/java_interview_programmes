package Strings;

public class Reverse_string_string_buffer {
    public static void main(String[] args)
    {
        String input = "Geeks for Geeks";

        StringBuilder input1 = new StringBuilder(input);

        // append a string into StringBuilder input1
        //input1.append(input);

        // reverse StringBuilder input1
        input1.reverse();

        // print reversed String
        System.out.println(input1);
    }
}

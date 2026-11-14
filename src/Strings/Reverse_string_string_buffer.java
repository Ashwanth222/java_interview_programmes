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

        //alternate
        StringBuffer sb1 = new StringBuffer();
        char[] ch = input.toCharArray();
        for(int i = input.length()-1; i>=0 ; i--){
            sb1.append(input.charAt(i));
        }
        System.out.println(sb1);
    }
}

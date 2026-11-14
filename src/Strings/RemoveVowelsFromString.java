package Strings;

import java.util.Scanner;

public class RemoveVowelsFromString {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string...");

        String inputString = sc.nextLine();

        String newInputString = inputString.replaceAll("[AEIOUaeiou]", "");

        System.out.println("The string without vowels...");

        System.out.println(newInputString);

        //sc.close();

        //alternate
        String s = "qwertyuiufdsdfghjkmnbvcx";
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'i' || s.charAt(i) == 'a' || s.charAt(i) == 'e'
                    || s.charAt(i) == 'o' | s.charAt(i) == 'u' ){
                System.out.println("Vowel: " + s.charAt(i));

            }
            else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}

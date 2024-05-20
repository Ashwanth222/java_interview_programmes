package Strings;

import java.util.Scanner;
//          Input String : Hi hello how are you?
//          Output String : you? are how hello Hi
public class ReverseSentence {
    public static String reverseTheSentence(String inputString)
    {
        String[] words = inputString.split("\\s");

        String outputString = "";

        for (int i = words.length-1; i >= 0; i--)
        {
            outputString = outputString + words[i] + " ";
        }

        return outputString;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Input String :");

        String inputString = sc.nextLine();

        String outputString = reverseTheSentence(inputString);

        System.out.println("Input String : "+inputString);

        System.out.println("Output String : "+outputString);

        sc.close();

        //alternate
        String s6 = "hello this is my name";
        StringBuffer  sb = new StringBuffer();
        String[] s7 = s6.split(" ");
        for(int l = s7.length-1; l>=0; l--){
            sb.append(s7[l] + " ");
        }
        System.out.println(sb);
    }
}

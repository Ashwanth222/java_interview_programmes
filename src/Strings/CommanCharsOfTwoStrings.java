package Strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CommanCharsOfTwoStrings {
    private static void printCommonChars(String firstString, String secondString)
    {
        char[] firstStringToCharArray = firstString.replaceAll("\\s+", "").toCharArray();

        char[] secondStringToCharArray = secondString.replaceAll("\\s+", "").toCharArray();

        Set<Character> firstStringSet = new TreeSet();

        Set<Character> secondStringSet = new TreeSet();

        for (char c : firstStringToCharArray)
        {
            firstStringSet.add(c);
        }

        for (char c : secondStringToCharArray)
        {
            secondStringSet.add(c);
        }

        firstStringSet.retainAll(secondStringSet);

        System.out.println("Common characters in alphabetical order : "+firstStringSet);

        System.out.println("Count : "+firstStringSet.size());
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two input strings :");

        String firstString = sc.nextLine();

        String secondString = sc.nextLine();

        printCommonChars(firstString, secondString);

        sc.close();

        //alternate
        String s1 = "abcdef";
        String s2 = "bdgfh";

        Set<Character> set = new HashSet<>();

        // Store characters of first string
        for (char ch : s1.toCharArray()) {
            set.add(ch);
        }

        System.out.print("Common Characters: ");

        for (char ch : s2.toCharArray()) {
            if (set.contains(ch)) {
                System.out.print(ch + " ");
            }
        }

        //alternate

        Set<Character> first = new HashSet<>();
        Set<Character> printed = new HashSet<>();

        for (char ch : s1.toCharArray()) {
            first.add(ch);
        }
        System.out.print("----------------");
        System.out.print("Common Characters: ");

        for (char ch : s2.toCharArray()) {
            if (first.contains(ch) && !printed.contains(ch)) {
                System.out.print(ch + " ");
                printed.add(ch);
            }
        }
    }
}

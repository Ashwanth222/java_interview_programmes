package java_programs;

import java.util.Scanner;

public class SubStringsOfString {
    public static void main(String[] args) {
        String s1 = "hel";
        int l = s1.length();
        for (int i = 0; i <= l - 1; i++) {
            for (int j = i + 1; j <= l ; j++) {
                String s2 = s1.substring(i, j);
                System.out.println(s2);
                //return s2;
            }
        }
    }
    }


package Strings;

import java.util.Scanner;

public class SwapTwoStringsWithoutThirdVariable {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First String :");

        String s1 = sc.next();

        System.out.println("Enter Second String :");

        String s2 = sc.next();

        System.out.println("Before Swapping :");

        System.out.println("s1 : "+s1);

        System.out.println("s2 : "+s2);

        //Swapping starts

        s1 = s1 + s2;

        s2 = s1.substring(0, s1.length()-s2.length());

        s1 = s1.substring(s2.length());

        //Swapping ends

        System.out.println("After Swapping :");

        System.out.println("s1 : "+s1);

        System.out.println("s2 : "+s2);

        //alternate
        String s = "qwerty";
        String k = "poiuyt";
        String l = s + k;

        String s3 = l.substring(k.length(), l.length());
        String s4 = l.substring(0, s.length());
        System.out.println("s3 " + s3);
        System.out.println("s4 " + s4);
    }
}

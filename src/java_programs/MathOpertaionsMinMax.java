package java_programs;

import static java.lang.Math.min;

public class MathOpertaionsMinMax {
    public static void main(String[] args)
    {
        int a = 3;
        int b = 4;
        System.out.println(min(a, b));
        System.out.println(Math.max(2, 3));    //3
        System.out.println(Math.max(2.5, 3));     //4.0
        System.out.println( Math.min(2.5, 4.6));   //2.5
        System.out.println(Math.abs(-2));         //2
        System.out.println(Math.abs(-2.1));
    }
}

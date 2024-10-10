package java_programs;

import static java.lang.Math.min;

public class MathOpertaions {
    public static void main(String[] args)
    {
        int a = 3;
        int b = 4;
        System.out.println(min(a, b));
        System.out.println(Math.max(2, 3));    //3
        System.out.println(Math.max(2.5, 3));     //4.0
        System.out.println(Math.min(2.5, 4.6));   //2.5
        System.out.println(Math.abs(-2));         //2
        System.out.println(Math.abs(-2.1));       //2.1
        System.out.println(Math.random());       //any random
        System.out.println(Math.round(45.89));    //46
        System.out.println(Math.sqrt(16));     //4.0
        System.out.println(Math.ceil(4.05));  //5
        System.out.println(Math.ceil(4.45));   //5
        System.out.println(Math.ceil(4.85));   //5
        System.out.println(Math.ceil(3.95));   //4  highest value
        System.out.println(Math.ceil(-3.95));  //-3
        System.out.println(Math.floor(5.67));  //5.0
        System.out.println(Math.floor(-5.67));  //-6.0  lowest value
        System.out.println(Math.round(Math.sqrt(29.70)));  //5
        System.out.println(Math.round(Math.cbrt(29.70)));  //3
        int X = 3;
        System.out.println("The square of " + X + " is " +  Math.pow(X, 2));
// The square of 3 is 9.0

    }
}

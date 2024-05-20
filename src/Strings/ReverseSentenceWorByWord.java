package Strings;


import  java.util.Arrays;

public class ReverseSentenceWorByWord {
    public static void main(String[] args){
        String s1 = "Hi how are you";
        //Arrays.stream(s1.split(" "));
        String[] str = s1.split(" ");

        StringBuilder sb1 = new StringBuilder(Arrays.toString(str)).reverse();  //method 1
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder(s1).reverse();
        System.out.println(sb2);                                //method 2

        StringBuffer sb3 = new StringBuffer(s1).reverse();
        System.out.println(sb3);                                //method  3
    }
}

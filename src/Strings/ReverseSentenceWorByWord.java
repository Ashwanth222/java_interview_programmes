package Strings;


import  java.util.Arrays;

public class ReverseSentenceWorByWord {
    public static void main(String[] args){
        String s1 = "Hi how are you";
        //Arrays.stream(s1.split(" "));
        String[] str = s1.split(" ");

        StringBuilder sb = new StringBuilder(Arrays.toString(str)).reverse();
        System.out.println(sb);
    }
}

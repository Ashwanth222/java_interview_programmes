package java_programs;

import java.util.Arrays;

public class Finding_vowels {
    public static void main(String args[]) {

        String str = new String("Hi Welcome to Tutorialspoint");
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                System.out.println("Given string contains "+str.charAt(i)+" at the index "+i);
            }
        }

        //alternate
        Arrays.stream(str.replaceAll(" ", "").toLowerCase()
                .split(""))
                .filter(i -> i.matches("[aeiou]"))
                .forEach(System.out::println);

    }
}

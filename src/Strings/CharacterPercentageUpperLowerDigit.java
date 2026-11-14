package Strings;

import java.text.DecimalFormat;
import java.util.Arrays;

public class CharacterPercentageUpperLowerDigit {
    static void characterPercentage(String inputString) {
        //Getting total no of characters in the given string

        int totalChars = inputString.length();

        //Initializing upperCaseLetters, lowerCaseLetters, digits and others with 0

        int upperCaseLetters = 0;

        int lowerCaseLetters = 0;

        int digits = 0;

        int others = 0;

        //Iterating through each character of inputString

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            //If ch is in uppercase, then incrementing upperCaseLetters

            if (Character.isUpperCase(ch)) {
                upperCaseLetters++;
            }

            //If ch is in lowercase, then incrementing lowerCaseLetters

            else if (Character.isLowerCase(ch)) {
                lowerCaseLetters++;
            }

            //If ch is a digit, then incrementing digits

            else if (Character.isDigit(ch)) {
                digits++;
            }

            //If ch is a special character then incrementing others

            else {
                others++;
            }
        }

        //Calculating percentage of uppercase letters, lowercase letters, digits and other characters

        double upperCaseLetterPercentage = (upperCaseLetters * 100.0) / totalChars;

        double lowerCaseLetterPercentage = (lowerCaseLetters * 100.0) / totalChars;

        double digitsPercentage = (digits * 100.0) / totalChars;

        double otherCharPercentage = (others * 100.0) / totalChars;

        DecimalFormat formatter = new DecimalFormat("##.##");

        //Printing percentage of uppercase letters, lowercase letters, digits and other characters

        System.out.println("In '" + inputString + "' : ");

        System.out.println("Uppercase letters are " + formatter.format(upperCaseLetterPercentage) + "% ");

        System.out.println("Lowercase letters are " + formatter.format(lowerCaseLetterPercentage) + "%");

        System.out.println("Digits Are " + formatter.format(digitsPercentage) + "%");

        System.out.println("Other Characters Are " + formatter.format(otherCharPercentage) + "%");

        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        characterPercentage("Tiger Runs @ The Speed Of 100 km/hour.");

        characterPercentage("My e-mail : eMail_Address321@anymail.com");

        characterPercentage("AUS : 123/3, 21.2 Overs");

        //alternate


        String str = "Tiger Runs @ The Speed Of 100 km/hour.";

        int upperCase = 0;
        int lowerCase = 0;
        int digitCount = 0;
        int others = 0;

        String input = str.replace(" ", ""); // ignore spaces

        for (char ch : input.toCharArray()) {

            if (Character.isUpperCase(ch)) {
                upperCase++;
            } else if (Character.isLowerCase(ch)) {
                lowerCase++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                others++;
            }
        }

        int totalChars = input.length();

        double upperPercentage = (upperCase * 100.0) / totalChars;
        double lowerPercentage = (lowerCase * 100.0) / totalChars;
        double digitPercentage = (digitCount * 100.0) / totalChars;
        double otherPercentage = (others * 100.0) / totalChars;

        System.out.println("Total Characters : " + totalChars);
        System.out.println("Uppercase Letters : " + upperCase + " (" + String.format("%.2f", upperPercentage) + "%)");

        System.out.println("Lowercase Letters : " + lowerCase + " (" + String.format("%.2f", lowerPercentage) + "%)");

        System.out.println("Digits : " + digitCount + " (" + String.format("%.2f", digitPercentage) + "%)");

        System.out.println("Special Characters : " + others + " (" + String.format("%.2f", otherPercentage) + "%)");


        String input2 = str.replace(" ", "");

        long upperCase2 = input2.chars().filter(Character::isUpperCase).count();

        long lowerCase2 = input2.chars().filter(Character::isLowerCase).count();

        long digits = input2.chars().filter(Character::isDigit).count();

        long others2 = input2.length() - upperCase2 - lowerCase2 - digits;

        int total = input.length();

        System.out.printf("Uppercase: %.2f%%%n", (upperCase2 * 100.0) / total);
        System.out.printf("Lowercase: %.2f%%%n", (lowerCase2 * 100.0) / total);
        System.out.printf("Digits: %.2f%%%n", (digits * 100.0) / total);
        System.out.printf("Others: %.2f%%%n", (others2 * 100.0) / total);

    }
}

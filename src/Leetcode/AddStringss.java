package Leetcode;

import java.util.Arrays;

//Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
//
//You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
//
//
//
//Example 1:
//
//Input: num1 = "11", num2 = "123"
//Output: "134"
//Example 2:
//
//Input: num1 = "456", num2 = "77"
//Output: "533"
//Example 3:
//
//Input: num1 = "0", num2 = "0"
//Output: "0"
public class AddStringss {
    public static void main(String[] args){
        String num1 = "6344";
        String num2 = "6799";
        StringBuffer sb = new StringBuffer();
        int carry = 0;
        int s = 0;
        int i = num1.length()-1;
        int j = num2.length()-1;
        while(i>=0 || j>=0 || carry >0){
            if(i>=0){
                carry = carry + Character.getNumericValue(num1.charAt(i));
                i--;
            }
            if(j>=0){
                carry = carry +  Character.getNumericValue(num2.charAt(j));;
                j--;
            }
            s = carry%10;
            carry = carry/10;
           sb.append(s);
        }
        System.out.println(sb.reverse());
//------------------------------------------------------------------------------------
        //alternate
        String big = num1.length() >= num2.length() ? num1 : num2;
        String small = num1.length() < num2.length() ? num1 : num2;
        StringBuilder sb1 = new StringBuilder();
        int sum = 0;
        for (int k = 0; k < big.length(); k++) {
            int b = big.charAt(big.length() - k - 1) - '0';
            int so = k < small.length() ? (small.charAt(small.length() - k - 1) - '0') : 0;
            sum += b + so;
            sb1.append(sum % 10);
            sum /= 10;
        }
        if (sum > 0) sb1.append(sum);
        System.out.println(sb1.reverse().toString());
    }
}

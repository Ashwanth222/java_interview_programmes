package Leetcode;

public class AddDigits {
    public static void main(String[] args){
        int num = 8769234;
        int sum = 0;
        while(num>0){
           int r =  num%10;
           sum = sum +r;
           num = num/10;
        }
        System.out.println(sum);
    }
}

package Leetcode;

public class GCDOfTwoNumbers {
    public static void main(String[] args){
        int num1 = 12;
        int num2 = 8;
       int num3 = Math.min(num1, num2);
        for(int i = num3; i>0; i--){
            if(num1%i == 0 && num2%i ==0){
                System.out.println(i + " is the greatest common divisor");
                break;
            }
        }
    }
}

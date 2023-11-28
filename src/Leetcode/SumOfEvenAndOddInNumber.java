package Leetcode;

public class SumOfEvenAndOddInNumber {
    public static void main(String[] args){
        int num = 11223456;
        int sumEven = 0;
        int sumOdd = 0;
        int r;
        while(num>0){
            r = num % 10;
            if(r%2!=0) {
                sumOdd = sumOdd + r;
                num = num/10;
            }else{
                sumEven = sumEven + r;
                num = num/10;
            }
        }
        System.out.println("sum of even"+sumEven);
        System.out.println("sum of odd"+sumOdd);
    }
}

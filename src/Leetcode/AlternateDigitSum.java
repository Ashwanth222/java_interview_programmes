package Leetcode;

public class AlternateDigitSum {
    public static void main(String[] args){
        int num = 1163454675;
        int sumEvenIndex = 0;
        int sumOddIndex = 0;
       int l = String.valueOf(num).length()-1;
        int r;
        while(num>0){
            r = num % 10;
            if(l%2!=0) {
                sumOddIndex = sumOddIndex + r;
                num = num/10;
                l--;
            }else{
                sumEvenIndex = sumEvenIndex + r;
                num = num/10;
                l--;
            }
        }
        System.out.println("sum of even index: "+sumEvenIndex);
        System.out.println("sum of odd index: "+sumOddIndex);
    }
}

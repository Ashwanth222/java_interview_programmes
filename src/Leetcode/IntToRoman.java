package Leetcode;

public class IntToRoman {
    public static void main(String[] args){
        int num = 1565;
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"","C","CC", "CCC","CD", "D", "DC", "DCC", "DCCC", "CD"};
        String[] tens = {"","X","XX", "XXX","XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"","I","II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        StringBuffer sb = new StringBuffer();
        sb.append(thousands[num/1000]);
        sb.append(hundreds[(num/100)%10]);
        sb.append(tens[(num/10)%10]);
        sb.append(ones[(num)%10]);
        System.out.println(sb);
    }
}

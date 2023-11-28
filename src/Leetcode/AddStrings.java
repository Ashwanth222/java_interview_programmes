package Leetcode;

public class AddStrings {
    public static void main(String[] args){
        String num1 = "abc";
        String num2 = "def";
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int idxOne = num1.length() - 1;
        int idxTwo = num2.length() - 1;
        while (idxOne >= 0 || idxTwo >= 0 || carry > 0) {
            if (idxOne >= 0 && idxTwo >= 0) {
                carry += Character.getNumericValue(num1.charAt(idxOne--)) + Character.getNumericValue(num2.charAt(idxTwo--));
            } else if (idxOne >= 0 && idxTwo < 0) {
                carry += Character.getNumericValue(num1.charAt(idxOne--));
            } else if (idxOne < 0 && idxTwo >= 0) {
                carry += Character.getNumericValue(num2.charAt(idxTwo--));
            }
            sb.append(carry % 10);
            carry = carry > 9 ? carry / 10 : 0;
        }
        System.out.println(sb.reverse());

    }
}

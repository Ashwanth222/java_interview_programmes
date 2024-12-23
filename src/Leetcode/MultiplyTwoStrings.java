package Leetcode;

//Given two non-negative integers num1 and num2 represented as strings,
// return the product of num1 and num2, also represented as a string.
//
//Note: You must not use any built-in BigInteger library or convert the inputs
// to integer directly.
//
//
//
//Example 1:
//
//Input: num1 = "2", num2 = "3"
//Output: "6"
//Example 2:
//
//Input: num1 = "123", num2 = "456"
//Output: "56088"
public class MultiplyTwoStrings {
    public static void main(String[] args){
       String num1 = "123", num2 = "456";
       Integer numi1 = Integer.valueOf(num1);
       Integer numi2 = Integer.valueOf(num2);
       Integer multiply = numi1*numi2;
       System.out.println("multiply.toString() " +multiply.toString());

       //alternate
//        int multiple = 0, carry = 0, sum =0;
//        StringBuffer sb = new StringBuffer();
//        for(int i = num1.length()-1;i>=0;i--) {
//            for (int j = num1.length() - 1; j >= 0; j--) {
//                int m = Character.getNumericValue(num1.charAt(j));
//                int n = Character.getNumericValue(num2.charAt(i));
//                int mu = m * n + carry;
//                multiple = (mu % 10);
//                sb.append(multiple);
//                carry = mu / 10;
//            }
//            sum = Integer.parseInt(sb.reverse().toString());
//            carry = 0;
//            multiple = 0;
//            System.out.println(sum);
//        }
//        System.out.println("sb.reverse() " + sb.reverse());


        //alternate

        int m = num1.length(), n = num2.length();
        int[] pos = new int[m + n];

        for(int i = m - 1; i >= 0; i--) {
            for(int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j, p2 = i + j + 1;
                int sum1 = mul + pos[p2];
                pos[p1] += sum1 / 10;
                pos[p2] = (sum1) % 10;
            }
        }

        StringBuilder sb1 = new StringBuilder();
        for(int p : pos) if(!(sb1.length() == 0 && p == 0)) sb1.append(p);
        System.out.println(sb1.length() == 0 ? "0" : sb1.toString());
    }
}

package Leetcode;

//Example 1:
//
//Input: n = 00000010100101000001111010011100
//Output:    964176192 (00111001011110000010100101000000)
//Explanation: The input binary string 00000010100101000001111010011100 represents the
// unsigned integer 43261596, so return 964176192 which its binary representation is
// 00111001011110000010100101000000.
//Example 2:
//
//Input: n = 11111111111111111111111111111101
//Output:   3221225471 (10111111111111111111111111111111)
//Explanation: The input binary string 11111111111111111111111111111101 represents the unsigned
// integer 4294967293, so return 3221225471 which its binary representation is
// 10111111111111111111111111111111
public class ReverseBits {
    public static void main(String[] args){
        String input = "00000010100101000001111010011100";
        StringBuffer sb = new StringBuffer(input);
        sb.reverse();
        System.out.println(sb);
//        int sk = Integer.parseInt(String.valueOf(sb));
//        System.out.println(sk);

        //alternate
        char[] chars = input.toCharArray();
        StringBuffer sb1 = new StringBuffer();
        for(int i =chars.length-1; i>=0; i--){
            sb1.append(chars[i]);
        }
        System.out.println("reverse bits " + sb1);

        System.out.println(sb.toString().contentEquals(sb1));
    }
}

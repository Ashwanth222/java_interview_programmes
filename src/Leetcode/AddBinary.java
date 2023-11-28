package Leetcode;

public class AddBinary {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();
        String a = "111";
        String b = "110";
        int a_pointer = a.length()-1;
        int b_pointer = b.length()-1;
        int carry = 0;
        while(a_pointer>=0 || b_pointer>=0 || carry >0){
            int value = carry;
            if(a_pointer>=0){
                int c  =  Character.getNumericValue(a.charAt(a_pointer));
                value = value + c;
                a_pointer --;
            }
            if(b_pointer>=0){
                int d = Character.getNumericValue(b.charAt(b_pointer));
                value = value + d;
                b_pointer --;
            }
            sb.append(value % 2);
            carry = value / 2;

        }
System.out.println(sb.reverse());
    }
}

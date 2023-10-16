package Java8_programs;

public class PalindromeProgram {
    public static void main(String[] args){
        String str = "ROTATOR";
        StringBuffer sb = new StringBuffer(str);
        String str1 = sb.reverse().toString().toUpperCase();
        if (str.equals(str1))
        {
            System.out.println(str+" is a palindrome");
        }
        else
        {
            System.out.println(str+" is not a palindrome");
        }
    }
}

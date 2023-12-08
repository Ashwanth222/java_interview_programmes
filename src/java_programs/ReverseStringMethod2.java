package java_programs;

public class ReverseStringMethod2 {
    public static void main(String[] args){
        String s1 = "string-is-a-string";
        char[] ch = s1.toCharArray();
        int b_pointer = s1.length()-1;
        int a_pointer = 0;
        char temp;
        while(a_pointer<=b_pointer){
            temp = ch[b_pointer];
            ch[b_pointer] = ch[a_pointer];
            ch[a_pointer] = temp;
            a_pointer ++;
            b_pointer --;
        }
        System.out.println(ch);
    }
}

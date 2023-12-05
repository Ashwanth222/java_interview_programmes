package Strings;

public class IndexOfAndLastIndexOfMethods {
    public static void main(String[] args){
        String s = "Hi hello how are you? What are you doing? How do you do? what is this?";
        System.out.println(s.indexOf("are"));
        System.out.println(s.indexOf("y"));
        System.out.println(s.indexOf("y",19));
        System.out.println(s.indexOf("are",17));

        System.out.println(s.lastIndexOf("y"));
        System.out.println(s.lastIndexOf("y",19));
        System.out.println(s.lastIndexOf("you"));
        System.out.println(s.lastIndexOf("you",47));
    }
}

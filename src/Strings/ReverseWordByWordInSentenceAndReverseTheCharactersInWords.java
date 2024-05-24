package Strings;


import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ReverseWordByWordInSentenceAndReverseTheCharactersInWords {
    public static void main(String[] args) {
//        Input: String str = “Hello world, how are you?”
//
//        Output: “you? are how world, Hello”
        String str1 = "Hello world, how are you?";
        StringBuffer sb4 = new StringBuffer();
        Arrays.stream(str1.split("\\s+"))
                .collect(Collectors.toCollection(LinkedList::new))
                .descendingIterator().forEachRemaining(System.out::println);

        //alternate
       String s5 =  Pattern.compile(" +").splitAsStream(str1)
                .map(word->new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
       System.out.println("s" + s5);




        //alternate
        String str = "Hello world, how are you?";

        String[] s = str.split(" ");
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();

        for (int i = s.length - 1; i >= 0; i--) {
            sb.append(s[i] + " ");
        }

        System.out.println(sb);
        String sl = sb.toString();
        System.out.println(sl);
        String[] sk = sl.split(" ");
        for (int k = 0; k < sk.length; k++) {
            sb1.append(sk[k]).reverse().append(" ");
        }
        System.out.println(sb1);
    }
}

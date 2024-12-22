package Java8_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//You need to tell whether the strings are meta strings or not.
// Meta strings are strings that can be made equal by swapping exactly one
// pair of distinct characters in one of the strings.
// Note: Equal strings are not considered as meta strings.
public class MetaStringOrNot {
    public static void main(String[] args){
        String s1 = "Conseree";
        String s2 = "Converse";
        List<Character> list = new ArrayList<>();
        if(s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    list.add(s1.charAt(i));
                    list.add(s2.charAt(i));
                }
            }
            //System.out.println("list"+list);
            Map<Character,Long> map = list.stream()
                    .collect(Collectors.groupingBy(e-> e, Collectors.counting()));
           // System.out.println("map"+map);
            long coun = map.entrySet().stream().filter(p->p.getValue()==2).count();
//            System.out.println("coun"+coun);
//            System.out.println("list.size()"+list.size());
            if(coun == list.size()/2 && coun != 0) {
                System.out.println("above both are meta strings");
            }else {
                System.out.println("both are not meta strings");
            }
        }else {
            System.out.println("both are not meta strings");
        }

        //===================================================================

        StringBuffer sb = new StringBuffer();
        if(s1.length() == s2.length()){
            for(int i = 0; i<s1.length();i++){
                if (s1.charAt(i) != s2.charAt(i)) {
                   sb.append(s1.charAt(i));
                   sb.append(s2.charAt(i));
                }
            }
            Map<String,Long> map1  = Arrays.stream(sb.toString().split(""))
                    .collect(Collectors.groupingBy(e->e,Collectors.counting()));
            long count = map1.entrySet().stream().filter(k->k.getValue() == 2).count();
            if(map1.size() == count){
                System.out.println("above both are meta strings");
            }else{
                System.out.println("both are not meta strings");
            }
            //System.out.println(sb.toString());
        }else{
            System.out.println("both are not meta strings");
        }

        //alternate
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        if(s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    sb1.append(s1.charAt(i));
                    sb2.append(s2.charAt(i));
                }
            }
            String s = sb1.toString();
            String t = sb2.toString();
            String st = Arrays.stream(s.split("")).sorted().collect(Collectors.joining());
            String ts = Arrays.stream(t.split("")).sorted().collect(Collectors.joining());
            System.out.println("s " + s);
            System.out.println("t " + t);
            System.out.println("s " + st);
            System.out.println("t " + ts);
            System.out.println("st length " + st.length());
            System.out.println("ts length " + ts.length());

            if(st.length() == 2 && ts.length() == 2 && st.equals(ts)) {
                System.out.println("above both are meta strings");
            }else {
                System.out.println("both are not meta strings");
            }
        }else {
            System.out.println("both are not meta strings");
        }
    }
}

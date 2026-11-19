package java_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//You need to tell whether the strings are meta strings or not.
// Meta strings are strings that can be made equal by swapping exactly one
// pair of distinct characters in one of the strings.
// Note: Equal strings are not considered as meta strings.
public class MetaStringOrNot {
    public static void main(String[] args) {
        String s1 = "Converse";
        String s2 = "Conserve";
        List<Character> list = new ArrayList<>();
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    list.add(s1.charAt(i));
                    list.add(s2.charAt(i));
                }
            }
            //System.out.println("list"+list);
            Map<Character, Long> map = list.stream()
                    .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
            // System.out.println("map"+map);
            long coun = map.entrySet().stream().filter(p -> p.getValue() == 2).count();
//            System.out.println("coun"+coun);
//            System.out.println("list.size()"+list.size());
            if (coun == list.size() / 2 && coun != 0) {
                System.out.println("above both are meta strings");
            } else {
                System.out.println("both are not meta strings");
            }
        } else {
            System.out.println("both are not meta strings");
        }

        //===================================================================

        StringBuffer sb = new StringBuffer();
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    sb.append(s1.charAt(i));
                    sb.append(s2.charAt(i));
                }
            }
            Map<String, Long> map1 = Arrays.stream(sb.toString().split(""))
                    .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
            long count = map1.entrySet().stream().filter(k -> k.getValue() == 2).count();
            if (map1.size() == count) {
                System.out.println("above both are meta strings");
            } else {
                System.out.println("both are not meta strings");
            }
            //System.out.println(sb.toString());
        } else {
            System.out.println("both are not meta strings");
        }

        //alternate
        String s3 = "Converse";
        String s4 = "Conserve";
        StringBuffer sb1 = new StringBuffer();
        if ((s3.length() != s4.length())) {
            System.out.println("both are not meta string");
        }

        for (int i = 0; i < s3.length() - 1; i++) {
            if (s3.charAt(i) != s4.charAt(i)) {
                sb1.append(s3.charAt(i));
                sb1.append(s4.charAt(i));
            }
        }
        long count = sb1.chars().boxed().collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream().filter(u -> u.getValue() % 2 == 0).count();
        if (count == (sb1.length() / 2)) {
            System.out.println("both are meta strings");
        } else {
            System.out.println("both are not meta strings");
        }

        //alternate
        if (s1.length() != s2.length()) {
            System.out.println("not meta strings");
        }

        if (s1.equals(s2)) {
            System.out.println("not meta strings");
        }

        List<Integer> mismatch = new ArrayList<>();

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                mismatch.add(i);
            }
        }

        if (mismatch.size() != 2) {
            System.out.println("not meta strings");
        }

        int first = mismatch.get(0);
        int second = mismatch.get(1);

        System.out.println(s1.charAt(first) == s2.charAt(second)
                && s1.charAt(second) == s2.charAt(first));

        //s1 = geeks
        //     g     k
        //
        //s2 = keegs
        //     k     g
        //
        //Swap g and k in s1
        //
        //geeks -> keegs

        String s5 = "geeks";
        String s6 = "keegs";

        if (isMetaString(s1, s2)) {
            System.out.println("Meta Strings");
        } else {
            System.out.println("Not Meta Strings");
        }
    }

    private static boolean isMetaString(String s1, String s2) {

        if (s1.length() != s2.length() || s1.equals(s2)) {
            return false;
        }

        List<Integer> diff = IntStream.range(0, s1.length())
                .filter(i -> s1.charAt(i) != s2.charAt(i))
                .boxed()
                .collect(Collectors.toList());

        return diff.size() == 2
                && s1.charAt(diff.get(0)) == s2.charAt(diff.get(1))
                && s1.charAt(diff.get(1)) == s2.charAt(diff.get(0));
    }
}

